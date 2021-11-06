package controladvance.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {
    @Test
    void testLabels() {
        Labels labels = new Labels();
        int[][] table = labels.getTableOfNumbers(5);

        assertEquals(6, table[2][2]);
        assertEquals(8, table[3][3]);
        assertEquals(10, table[4][4]);
    }
}
