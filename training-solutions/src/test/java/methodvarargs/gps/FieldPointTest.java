package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FieldPointTest {

    @Test
    void testCreateFieldPoint() {
        FieldPoint fieldPoint = new FieldPoint(LocalDateTime.of(2021, 11, 28, 10, 30), -47.343434, 45.343434);

        assertEquals(LocalDateTime.of(2021, 11, 28, 10, 30), fieldPoint.getTimeOfSetting());
        assertNull(fieldPoint.getTimeOfLogging());
        assertEquals(-47.343434, fieldPoint.getLatitude());
        assertEquals(45.343434, fieldPoint.getLongitude());
    }

    @Test
    void setTimeOfLogging() {
        FieldPoint fieldPoint = new FieldPoint(LocalDateTime.of(2021, 11, 28, 10, 30), -47.343434, 45.343434);

        fieldPoint.setTimeOfLogging(LocalDateTime.of(2021, 11, 28, 10, 32));

        assertEquals(LocalDateTime.of(2021, 11, 28, 10, 32), fieldPoint.getTimeOfLogging());
    }
}