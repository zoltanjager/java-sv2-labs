package interfaces.figure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {


    @Test
    void testGetSideA() {
        Rectangle rectangle = new Rectangle(5,4);

        assertEquals(5, rectangle.getSideA());
    }

    @Test
    void testGetSideB() {
        Rectangle rectangle = new Rectangle(5,4);

        assertEquals(4, rectangle.getSideB());
    }

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(5,4);

        assertEquals(20, rectangle.getArea());
    }
}