package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testContainsFewerHabitants() {
        Town town = new Town();

        List<Integer> towns = Arrays.asList(50000, 58000, 20000, 35000 );

        assertTrue(town.containsFewerHabitants(towns, 25000));
        assertFalse(town.containsFewerHabitants(towns, 5000));

    }
}