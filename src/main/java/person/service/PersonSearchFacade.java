package person.service;

import contact.Contact;
import contact.ContactService;
import person.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class PersonSearchFacade {

    private ContactService contactService;
    private PersonService personService;

    public PersonSearchFacade(ContactService contactService, PersonService personService) {
        this.contactService = contactService;
        this.personService = personService;
    }

    public String showPersonInfo(String name) {
        Person person = personService.search(name);
        List<Contact> contacts = contactService.search(name);

        return person.showBrief() + contacts.stream().map(contact -> contact.getName()).collect(Collectors.joining(", "));
    }
}
