package contact;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactBook {

    List<Contact> contacts = new ArrayList<>();

    public ContactBook() {
        Contact contact =  new Contact();
        contact.setName("a");
        List<String> emails = new ArrayList<>();
        emails.add("a.a.com");
        contact.setEmails(emails);
        List<String> numbers = new ArrayList<>();
        numbers.add("1234");
        numbers.add("789");
        numbers.add("34567");
        contact.setNumbers(numbers);
        contacts.add(contact);

        Contact contact1 =  new Contact();
        contact1.setName("a");
        List<String> emails1 = new ArrayList<>();
        emails1.add("b@a.com");
        contact1.setEmails(emails1);
        List<String> numbers1 = new ArrayList<>();
        numbers1.add("12345");
        contact1.setNumbers(numbers1);
        contacts.add(contact1);
    }
    public void add(Contact contact) {
        this.contacts.add(contact);
    }

    public List<Contact> search(String input) {
        return contacts.stream()
                .filter(contact -> contact.isIncluded(input))
                .collect(Collectors.toList());
    }
}
