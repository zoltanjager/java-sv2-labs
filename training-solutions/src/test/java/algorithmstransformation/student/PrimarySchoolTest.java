package algorithmstransformation.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolTest {

    PrimarySchool primarySchool;

    @BeforeEach
    void init() {

        List<Person> persons = Arrays.asList(new Person("Kis Géza", 44, "Budapest, Váci út 22"),
                                             new Person("Kis Ottó", 12, "Budapest, Bartók B. út 11"),
                                             new Person("Tóth Ottó", 8, "Budapest Váci út 44"),
                                             new Person("Kis Béla", 32, "Budapest Fő utca 3"),
                                             new Person("Nagy Anna", 8, "Budapest Petőfi utca 5"),
                                             new Person("Kis Adél", 10, "Budapest Váci út 8"));

        primarySchool = new PrimarySchool(persons);
    }

    @Test
    void testGetStudents() {
        List<Student> students = primarySchool.getStudents();

        assertEquals(4, students.size());
    }
}