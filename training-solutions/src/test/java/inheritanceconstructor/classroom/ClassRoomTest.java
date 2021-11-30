package inheritanceconstructor.classroom;

import inheritanceconstructor.classroom.ClassRoom;
import inheritanceconstructor.classroom.Course;
import inheritanceconstructor.classroom.Facility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {


    @Test

    void testCreateClassRoom() {

        ClassRoom classRoom = new ClassRoom("II.em", 15, Facility.COMPUTERS);

        assertEquals("II.em", classRoom.getLocation());
        assertEquals(15, classRoom.getCapacity());
        assertEquals(Facility.COMPUTERS, classRoom.getFacility());
    }

    @Test
    void testIsSuitable() {

        Course course = new Course(15, Facility.COMPUTERS);
        Course anotherCourse = new Course(25, Facility.COMPUTERS);
        ClassRoom classRoom = new ClassRoom("II.em", 15, Facility.COMPUTERS);

        assertTrue(classRoom.isSuitable(course));
        assertFalse(classRoom.isSuitable(anotherCourse));
    }
}