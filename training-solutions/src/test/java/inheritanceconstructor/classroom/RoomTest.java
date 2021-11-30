package inheritanceconstructor.classroom;

import inheritanceconstructor.classroom.Room;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test

    void testCreateRoom() {

        Room room = new Room("II.em", 15);
        assertEquals(15, room.getCapacity());
        assertEquals("II.em", room.getLocation());
    }
}