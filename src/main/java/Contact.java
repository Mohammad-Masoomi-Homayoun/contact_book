import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

@Builder
public class Contact {

    private String name;
    private List<String> numbers;
    private List<String> emails;

    public Contact(String name, List<String> numbers, List<String> emails) {
        this.name = name;
        this.numbers = numbers;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public Contact nullObject() {
        return new Contact("no-name", new ArrayList<>(), new ArrayList<>());
    }
}
