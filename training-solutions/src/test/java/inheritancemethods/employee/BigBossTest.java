package inheritancemethods.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    BigBoss bigBoss;

    @BeforeEach
    void init() {
        bigBoss = new BigBoss("Jane Doe", "Budapest Rózsadomb", 500_000, 50, 500_000);
    }

    @Test

    void testCreateBigBoss(){

        assertEquals("Jane Doe", bigBoss.getName());
        assertEquals("Budapest Rózsadomb", bigBoss.getAddress());
        assertEquals(50, bigBoss.getNumberOfEmployees());
    }

    @Test

    void getSalary() {
        assertEquals(3_500_000, bigBoss.getSalary());
    }

    @Test

    void getBonus() {
        assertEquals(500_000, bigBoss.getBonus());
    }
}