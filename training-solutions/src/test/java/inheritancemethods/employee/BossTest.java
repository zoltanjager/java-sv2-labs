package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test

    void testCreateBoss(){
        Boss boss = new Boss("Jack Doe", "Budapest Bartók B.", 200_000, 10);

        assertEquals("Jack Doe", boss.getName());
        assertEquals("Budapest Bartók B.", boss.getAddress());
        assertEquals(10, boss.getNumberOfEmployees());
    }

    @Test

    void testGetSalary() {
        Boss boss = new Boss("Jack Doe", "Budapest Bartók B.", 200_000, 10);

        assertEquals(400_000, boss.getSalary());
    }
}