package inheritanceconstructor.classroom;

import inheritanceconstructor.classroom.Course;
import inheritanceconstructor.classroom.Facility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test

    void testCreateCourse() {

        Course course = new Course(25, Facility.COMPUTERS);

        assertEquals(25, course.getParticipants());
        assertEquals(Facility.COMPUTERS,course.getFacilityNeeded());
    }
}