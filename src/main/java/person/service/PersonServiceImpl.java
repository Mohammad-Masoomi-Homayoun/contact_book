package person.service;

import person.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    List<Person> people = new ArrayList<>();

    @Override
    public Person search(String input) {
        return people.stream()
                .filter(person -> person.getName().equalsIgnoreCase(input))
                .findFirst().orElse(null);
    }
}
