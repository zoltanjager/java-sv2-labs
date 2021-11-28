package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test

    void testCreate() {

        Time time = new Time(10, 10, 10);

        assertEquals(10, time.getHours());
        assertEquals(10, time.getMinutes());
        assertEquals(10, time.getSeconds());
    }

    @Test

    void testIsEqualWithIntParameters() {

        Time time = new Time(10, 10, 10);

        assertTrue(time.isEqual(10, 10, 10));
        assertFalse(time.isEqual(11, 10, 10));
    }

    @Test

    void testIsEqualWithTimeParameter() {

        Time time = new Time(10, 10, 10);
        Time anotherTime = new Time(10, 10, 10);
        Time anotherTime2 = new Time(12, 10, 10);

        assertTrue(time.isEqual(anotherTime));
        assertFalse(time.isEqual(anotherTime2));
    }

    @Test

    void testIsEarlierWithIntParameters() {

        Time time = new Time(10, 10, 10);

        assertTrue(time.isEarlier(11, 10, 10));
        assertFalse(time.isEarlier(9, 10, 10));
    }

    @Test

    void testIsEarlierWithTimeParameter() {

        Time time = new Time(10, 10, 10);
        Time anotherTime = new Time(9, 10, 10);
        Time anotherTime2 = new Time(11, 16, 17);

        assertFalse(time.isEarlier(anotherTime));
        assertTrue(time.isEarlier(anotherTime2));
    }
}