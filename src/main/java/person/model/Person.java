package person.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
public class Person {

    private String name;
    private Date birthDate;

    @Override
    public String toString() {
        return this.name + " " + this.birthDate;
    }

    public String showBrief() {
        return this.toString();
    }
}
