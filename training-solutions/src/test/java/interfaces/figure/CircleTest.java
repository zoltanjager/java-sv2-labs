package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testGetRadius() {
        Circle circle = new Circle(5);

        assertEquals(5, circle.getRadius());
    }

    @Test
    void testGetArea() {
        Circle circle = new Circle(5);

        assertEquals(78.54, circle.getArea(),0.01);
    }
}