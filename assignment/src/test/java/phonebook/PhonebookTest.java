package phonebook;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author urs
 */
public class PhonebookTest {

    Phonebook phonebook = new Phonebook();

    @Test
    public void phonebookAddsEntry() {
        phonebook.addEntry("Pekka","040-123456");
        assertThat(phonebook.searchByName("Pekka"))
                .as("An added person, phone number should be found")
                .contains("040-123456");
    }

    @Test
    public void phonebookSearchByNameNotFound() {
        assertThat( phonebook.searchByName( "Jukka" ) )
                .as("Person not present should return null")
                .isNull();
    }

    @Test
    void phonebookSearchByNumber() {
        String number = "040-123456";
        phonebook.addEntry("Pekka","040-123456");
        assertThat(this.phonebook.searchByNumber(number))
                .as("Search by number should return person's name")
                .contains("Pekka");
    }

    @Test
    void phonebookSearchByNumberNotFound() {
        String number = "02-444123";
        phonebook.addEntry("Pekka","040-123456");
        assertThat(this.phonebook.searchByNumber(number)).as("Search for number not present should return null")
                .isNull();
    }

    @Test
    public void phonebookSearchAddress(){
        phonebook.addEntry( "Pekka", "040-123456" );
        phonebook.addAddress( "Pekka", "Hulsterweg 6, Venlo" );
        assertThat(phonebook.searchByName( "Pekka" ))
                .as("after add, parts of the address required")
                .contains( "Hulsterweg 6", "Venlo" );
    }

    @Test
    public void phonebookSearchAddress2(){
        phonebook.addEntry( "Pekka", "040-123456", "Hulsterweg 6, Venlo");
        assertThat( phonebook.searchAddress( "Pekka" ) )
                .as("addEntry should add phone and address")
                .contains( "Hulsterweg 6" ,"Venlo", "040-123456" );
    }

    @Test
    public void phonebookDeletesEntry() {
        String name = "Pekka";
        String number = "040-123456";

        this.phonebook.addEntry(name, number);
        this.phonebook.deleteEntry("Pekka");
        assertThat(this.phonebook.searchByName(name)).isNull();
    }

    @Test
    public void phonebookSearchAddressNotFound(){
        phonebook.addEntry( "Pekka", "040-123456", "Hulsterweg 6, Venlo");
        String name = "Jill";
        assertThat(phonebook.searchAddress(name) )
                .isNull();
    }

    @Test
    public void addAnotherNumber(){
        phonebook.addEntry("Pek", "040-123456");
        phonebook.addEntry("Pek", "040-123457");
        ArrayList<String> list = new ArrayList<>();
        list.add("040-123456");
        list.add("040-123457");
        assertThat(phonebook.searchByName("Pek"))
                .isEqualTo(list + ", " + phonebook.address);
    }
}
