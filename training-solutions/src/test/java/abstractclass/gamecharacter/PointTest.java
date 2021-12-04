package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {


    @Test
    void testCreatePoint() {

        Point point = new Point(3, 4);

        assertEquals(3, point.getX());
        assertEquals(4, point.getY());
    }

    @Test
    void testDistance() {

        Point point = new Point(3, 4);
        Point point2 = new Point(3, 7);

        assertEquals(3,point.distance(point2));
    }
}