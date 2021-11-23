package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    @Test

    void testGetMin() {
        Temperature temperature = new Temperature();
        List<Integer> temperatures = Arrays.asList( -2, 5, 20, 6, -10);
        assertEquals(-10, temperature.getMin(temperatures));

    }


}