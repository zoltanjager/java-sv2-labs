package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void testGetTrainerWithMaxAge() {
        List<Trainer> trainers = Arrays.asList( new Trainer("John Doe", 34),
                                                new Trainer("Jack Doe", 54),
                                                new Trainer("Jane Doe", 26));

        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();
        assertEquals(trainers.get(1), maxAgeCalculator.getTrainerWithMaxAge(trainers));
    }
}