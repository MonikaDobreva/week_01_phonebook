package phonebook;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author urs
 */
public class BookEntry {
    private String number;
    private String address;
    private List numbers;

    public BookEntry(){
        this.numbers = new ArrayList<String>();
    }

    public void add(String number){
        this.number = number;
        this.numbers.add(number);
    }

    public void add(String number, String address){
        this.number = number;
        this.numbers.add(number);
        this.address = address;
    }

    public void addAddress(String address){
        this.address = address;
    }

    public List<String> getNumber(){
        return this.numbers;
    }

    public String getAddress(){
        return this.address;
    }
}
