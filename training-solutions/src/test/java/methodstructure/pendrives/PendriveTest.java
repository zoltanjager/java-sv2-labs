package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PendriveTest {

    @Test

    void createPendrive(){
        Pendrive pendrive = new Pendrive("Pendrive1", 8, 5000);

        assertEquals("Pendrive1", pendrive.getName());
        assertEquals(8, pendrive.getCapacity());
        assertEquals(5000, pendrive.getPrice());
    }

    @Test

    void testRisePrice() {
        Pendrive pendrive = new Pendrive("Pendrive1", 8, 5000);

        pendrive.risePrice(20);
        assertEquals(6000, pendrive.getPrice());
    }

    @Test

    void testComparePricePerCapacity() {
        Pendrive pendrive = new Pendrive("Pendrive1", 8, 5000);
        Pendrive pendrive1 = new Pendrive("Pendrive1", 16, 6000);

        assertEquals(1, pendrive.comparePricePerCapacity(pendrive1));
        assertEquals(-1, pendrive1.comparePricePerCapacity(pendrive));
        assertEquals(0, pendrive.comparePricePerCapacity(pendrive));
    }

    @Test

    void testIsCheaperThen() {
        Pendrive pendrive = new Pendrive("Pendrive1", 8, 5000);
        Pendrive pendrive1 = new Pendrive("Pendrive1", 16, 6000);

        assertTrue(pendrive.isCheaperThen(pendrive1));
        assertFalse(pendrive1.isCheaperThen(pendrive));
    }
}