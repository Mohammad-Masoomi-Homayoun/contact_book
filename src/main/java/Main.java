import contact.ContactService;
import contact.ContactServiceImpl;

public class Main {


    public static void main(String[] args) {
       ContactService contactService = new ContactServiceImpl();
       contactService.start();
    }



}
