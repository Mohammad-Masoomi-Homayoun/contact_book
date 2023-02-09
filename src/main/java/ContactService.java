import java.util.List;
import java.util.Scanner;

public interface ContactService {

    void add(Contact contact);
    void start();
    List<Contact> search(String input);
}
