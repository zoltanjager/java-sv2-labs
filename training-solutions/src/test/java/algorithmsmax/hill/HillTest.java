package algorithmsmax.hill;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HillTest {
    @Test

    void testGetMax() {
        Hill hill = new Hill();
        List<Integer> hills = Arrays.asList( 500, 545, 2000, 3500, 1014);
        assertEquals(3500, hill.getMax(hills));

    }

}