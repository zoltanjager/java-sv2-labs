package methodpass.troopers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    @Test

    void createPosition() {
        Position position = new Position(1.2, 2.4);

        assertEquals(1.2, position.getPosX());
        assertEquals(2.4, position.getPosY());
    }

    @Test

    void testDistanceFrom() {

        Position position = new Position(1.2, 2.4);
        Position anotherPosition = new Position(2.2, 3.4);

        assertEquals(1.4142135623730951,position.distanceFrom(anotherPosition));
    }
}