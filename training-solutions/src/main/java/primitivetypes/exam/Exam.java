package primitivetypes.exam;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> person = new ArrayList<>();

    public List<Person> getPerson() {
        return person;
    }

    public void addPerson(Person person) {
        this.person.add(person);
    }
}
