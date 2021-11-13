package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    Student student = new Student();

    @Test
    public void testAddNote() {
        student.addNote(1);
        student.addNote(3);
        student.addNote(5);
        student.addNote(4);

        assertEquals(4, student.getNotes().size());
        assertEquals(3, student.getNotes().get(1).intValue());
    }

    @Test
    public void testAddNoteInvalidNote() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(7));
        assertEquals("Note must be between 1 and 5!", exception.getMessage());
    }

}
