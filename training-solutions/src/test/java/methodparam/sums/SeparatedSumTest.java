package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void testSum() {
        SeparatedSum separatedSum = new SeparatedSum();

        Sums sums = separatedSum.sum(separatedSum.readFile());

        assertEquals(110.6, sums.getSumPositives(), 0.0001);
        assertEquals(-153.3, sums.getSumNegatives(), 0.0001);
    }
}