package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {

    @Test
    public void testName() {
        Dragon dragon = new Dragon("Süsü",1, 2.1);

        assertEquals("Süsü", dragon.getName());
        assertNotEquals("Süsüke", dragon.getName());
    }

    @Test
    public void testNumberOfHeads() {
        Dragon dragon = new Dragon("Süsü",1, 2.1);

        assertEquals(1, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() == 3);
    }

    @Test
    public void testHeight() {
        Dragon dragon = new Dragon("Süsü",1, 2.1);

        assertEquals(2.1, dragon.getHeight(), 0.005);
    }

    @Test
    public void testNull() {
        Dragon dragon = new Dragon("Süsü",1, 2.1);
        Dragon anotherDragon = null;

        assertNotNull(dragon);
        assertNull(anotherDragon);
    }

    @Test
    public void testSameObjects() {
        Dragon dragon = new Dragon("Süsü",1, 2.1);
        Dragon anotherDragon = dragon;

        assertSame(dragon,anotherDragon);
    }

    @Test
    public void testNotSameObjects() {
        Dragon dragon = new Dragon("Süsü",1, 2.1);
        Dragon anotherDragon = new Dragon("Süsü",1, 2.1);

        assertNotSame(dragon, anotherDragon);
    }
}
