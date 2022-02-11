package phonebook;

/**
 * 
 * @author urs
 */
public class BookEntry {
    private String number;
    private String address;
    private String name;

    public BookEntry(){}

    public void add(String number){
        this.number = number;
    }

    public void add(String number, String address){
        this.number = number;
        this.address = address;
    }

    public void addName(String name){
        this.name = name;
    }

    public void addAddress(String address){
        this.address = address;
    }

    public String getNumber(){
        return this.number;
    }

    public String getAddress(){
        return this.address;
    }
}
