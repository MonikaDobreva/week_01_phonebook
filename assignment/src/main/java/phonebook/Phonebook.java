package phonebook;

import java.util.HashMap;
import java.util.Map;

/**
 * PhoneBook class to manage contacts.
 * @author urs
 */
public class Phonebook {

    private String number;
    String address;
    private String name;
    private BookEntry entry;
    private Map<String, BookEntry> map;

    /**
     * Initializes your phone book.
     */
    public Phonebook() {
        this.entry = new BookEntry();
        this.map = new HashMap<String, BookEntry>();
    }

    /**
     * Adds entry to your phone book. If an entry with this name already exists,
     * just an additional phone number is added.
     * @param name of a relative person
     * @param number belonging to the name.
     */
    public void addEntry(String name, String number) {
        if(this.map.containsKey(name)){
            this.map.get(name).add(number);
        } else {
            this.name = name;
            this.number = number;
            this.entry.add(this.number);
            this.map.put(this.name, this.entry);
        }
    }

    public void addEntry(String name, String number, String address){
        if(this.map.containsKey(name)){
            this.entry = (BookEntry) this.map.get(name);
            this.entry.add(number, address);
        } else {
            this.name = name;
            this.number = number;
            this.address = address;
            this.entry.add(this.number, this.address);
            this.map.put(this.name, this.entry);
        }
    }

    /**
     * Search your phone book by name and return all information about the person
     * with this name as text.
     * @param name to lookup
     * @return all info about this person, or null if not found
     */
    public String searchByName(String name) {
        if (this.map.containsKey(name)){
            this.entry = (BookEntry) this.map.get(name);
            return this.entry.getNumber() + ", " + this.entry.getAddress();
        }
        return null;
    }

    /**
     * Search all information belonging to a person with the given phone number.
     * @param number to search
     * @return all info about the belonging person, or null if not found.
     */
    public String searchByNumber(String number) {
        for(Map.Entry<String, BookEntry> entr : map.entrySet()){
            if(entr.getValue().getNumber().contains(number)){
                return entr.getKey();
            }
        }
        return null;
    }

    /**
     * Add address to name. Adds a new address if there is no address yet, otherwise
     * the address is updated.
     * @param name to add address to
     * @param address address to add
     */
    public void addAddress(String name, String address) {
        this.name = name;
        this.address = address;
        this.entry.addAddress(this.address);
    }

    public String searchAddress(String name){
        if(this.map.containsKey(name)){
            this.entry = (BookEntry) this.map.get(name);
            return this.entry.getAddress() + ", " + this.entry.getNumber();
        }
        return null;
    }

    /**
     * Delete entry from phone book.
     * @param name whose entry should be deleted.
     */
    public void deleteEntry(String name) {
        this.map.remove(name);
    }
}
