package inheritancemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeepTest {

    @Test

    void testCreateJeep() {
        Jeep jeep = new Jeep(10, 40, 60, 20, 10);

        assertEquals(20,jeep.getExtraCapacity());
        assertEquals(10, jeep.getExtraFuel());


    }

    @Test

    void testIsFuelAvailable() {

        Jeep jeep = new Jeep(10, 40, 60, 20, 10);

        assertTrue(jeep.isFuelAvailable(300));
        assertFalse(jeep.isFuelAvailable(700));
    }

    @Test

    void testDrive(){

        Jeep jeep = new Jeep(10, 40, 60, 20, 10);

        jeep.drive(300);
        assertEquals(20, jeep.getFuel());
        assertEquals(0,jeep.getExtraFuel());
    }

    @Test

    void testCalculateRefillAmount() {

        Jeep jeep = new Jeep(10, 40, 60, 20, 10);

        assertEquals(30, jeep.calculateRefillAmount());
    }
}