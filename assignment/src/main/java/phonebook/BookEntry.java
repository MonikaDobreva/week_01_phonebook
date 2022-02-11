package phonebook;



/**
 * 
 * @author urs
 */
public class BookEntry {
    private String number;
    private String address;

    public BookEntry(){}

    public void add(String number){
        this.number = number;
    }

    public void add(String number, String address){
        this.number = number;
        this.address = address;
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
