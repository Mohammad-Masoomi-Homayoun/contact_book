import contact.ContactService;
import contact.ContactServiceImpl;
import person.service.PersonSearchFacade;
import person.service.PersonService;
import person.service.PersonServiceImpl;

public class Main {


    public static void main(String[] args) {
       ContactService contactService = new ContactServiceImpl();
       contactService.start();

       String name = "Homa";

       ContactService contactService1 = new ContactServiceImpl();
        PersonService personService = new PersonServiceImpl();

        PersonSearchFacade personSearchFacade = new PersonSearchFacade(contactService1, personService);
        personSearchFacade.showPersonInfo(name);
    }



}
