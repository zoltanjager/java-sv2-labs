package algorithmstransformation.student;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> persons;

    public PrimarySchool(List<Person> persons) {
        this.persons = persons;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person actual : persons) {
            if (actual.getAge() >= 6 && actual.getAge() <= 14) {
                Student student = new Student(actual.getName(), actual.getAddress());
                students.add(student);
            }
        }
        return students;
    }
}
