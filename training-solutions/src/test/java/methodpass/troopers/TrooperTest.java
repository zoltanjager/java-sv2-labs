package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrooperTest {

    @Test
    void testCreateTrooper() {
        Trooper trooper = new Trooper("John Doe");

        assertEquals("John Doe", trooper.getName());
        assertEquals(0, trooper.getPosition().getPosX());
        assertEquals(0, trooper.getPosition().getPosY());
    }

    @Test

    void testCreateTrooperWithNameIsNull() {
        Exception e = assertThrows(IllegalArgumentException.class, ()-> new Trooper(null));
        assertEquals("A Név nem lehet üres!", e.getMessage());
    }

    @Test

    void testCreateTrooperWithNameIsEmpty() {
        Exception e = assertThrows(IllegalArgumentException.class, ()-> new Trooper(""));
        assertEquals("A Név nem lehet üres!", e.getMessage());
    }


    @Test

    void testChangePosition() {
        Trooper trooper = new Trooper("John Doe");
        Position target = new Position(1.2, 2.4);

        trooper.changePosition(target);

        assertEquals(1.2, trooper.getPosition().getPosX());
        assertEquals(2.4, trooper.getPosition().getPosY());
    }

    @Test

    void testChangePositionToNull() {
        Trooper trooper = new Trooper("John Doe");

        Position target = null;
        Exception e = assertThrows(IllegalArgumentException.class, ()-> trooper.changePosition(target));
        assertEquals("A pozició nem lehet üres!", e.getMessage());
    }


    @Test
    void testDistanceFrom() {
        Trooper trooper = new Trooper("John Doe");

        Position target = new Position(1.2, 2.4);

        assertEquals(2.6832815, trooper.distanceFrom(target), 0.000001);
    }
}