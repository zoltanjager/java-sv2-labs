package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void testGetLengthOfSide() {
        Triangle triangle = new Triangle(5, 6);

        assertEquals(5, triangle.getLengthOfSide());
    }

    @Test
    void testGetHeight() {
        Triangle triangle = new Triangle(5, 6);

        assertEquals(6, triangle.getHeight());

    }

    @Test
    void testGetArea() {
        Triangle triangle = new Triangle(5, 6);

        assertEquals(15, triangle.getArea());
    }
}