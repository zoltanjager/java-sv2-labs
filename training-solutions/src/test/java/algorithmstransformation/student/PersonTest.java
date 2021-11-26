package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test

    void createPerson() {

        Person person = new Person("Kis Béla", 25, "Pécs, Fő utca 25");

        assertEquals("Kis Béla", person.getName());
        assertEquals(25, person.getAge());
        assertEquals("Pécs, Fő utca 25", person.getAddress());
    }
}