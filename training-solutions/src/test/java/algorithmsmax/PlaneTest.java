package algorithmsmax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaneTest {

    @Test
    void testGetLongestOcean() {
        String map = "1000000011111000000000000111111111100001000001" +
                "0000100000111111110000101000000000111110000000000000" +
                "000100000001000000000000111111000000000100000000000011";
        Plane plane = new Plane();

        assertEquals(16, plane.getLongestOcean(map));
    }
}