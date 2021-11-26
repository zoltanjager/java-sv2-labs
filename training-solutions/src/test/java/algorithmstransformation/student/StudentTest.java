package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void createStudent() {

        Student student = new Student("Kis Géza", "Pécs, Fő utca 25");

        assertEquals("Kis Géza", student.getName());
        assertEquals("Pécs, Fő utca 25", student.getAddress());
    }

}