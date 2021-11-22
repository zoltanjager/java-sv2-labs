package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test

    void testCountChildrenWithHeightGreaterThan() {
        List<Integer> children = Arrays.asList(123,130,128,121,120);
        Height height = new Height();

        assertEquals(2, height.countChildrenWithHeightGreaterThan(children,125));
    }
}