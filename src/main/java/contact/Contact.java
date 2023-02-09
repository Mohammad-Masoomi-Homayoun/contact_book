package contact;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Builder
@Data
@ToString
public class Contact {

    private String name;
    private List<String> numbers;
    private List<String> emails;

    public Contact() {

    }

    public Contact(String name, List<String> numbers, List<String> emails) {
        this.name = name;
        this.numbers = numbers;
        this.emails = emails;
    }

    public Contact nullObject() {
        return new Contact("no-name", new ArrayList<>(), new ArrayList<>());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!Objects.equals(name, contact.name)) return false;
        return Objects.equals(emails, contact.emails);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (emails != null ? emails.hashCode() : 0);
        return result;
    }


    public boolean isIncluded(String input) {
        if (this.getName().contains(input)) {
            return true;
        }
        if (this.getEmails().stream().anyMatch( e ->  e.contains(input))) {
            return true;
        }
        if (this.getNumbers().stream().anyMatch(n -> n.contains(input))) {
            return true;
        }
        return false;
    }
}
