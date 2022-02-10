package phonebook;



/**
 * PhoneBook class to manage contacts.
 * @author urs
 */
public class Phonebook {

    //TODO add field(s)
    

    /**
     * Initializes your phone book.
     */
    public Phonebook() {
        //TODO 
        
    }

    /**
     * Adds entry to your phone book. If an entry with this name already exists,
     * just an additional phone number is added.
     * @param name of a relative person
     * @param number belonging to the name.
     */
    public void addEntry(String name, String number) {
        //TODO
        
    }

    /**
     * Search your phone book by name and return all information about the person
     * with this name as text.
     * @param name to lookup
     * @return all info about this person, or null if not found
     */
    public String searchByName(String name) {
        //TODO 
        return null;
    }

    /**
     * Search all information belonging to a person with the given phone number.
     * @param number to search
     * @return all info about the belonging person, or null if not found.
     */
    public String searchByNumber(String number) {
        //TODO 
        return null;
    }

    /**
     * Add address to name. Adds a new address if there is no address yet, otherwise
     * the address is updated.
     * @param name to add address to
     * @param address address to add
     */
    public void addAddress(String name, String address) {
        //TODO 
        
    }

    /**
     * Delete entry from phone book.
     * @param name whose entry should be deleted.
     */
    public void deleteEntry(String name) {
        //TODO 
        
    }
}
