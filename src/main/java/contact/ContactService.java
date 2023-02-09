package contact;

import java.util.List;

public interface ContactService {

    void add(Contact contact);
    void start();
    List<Contact> search(String input);
}
