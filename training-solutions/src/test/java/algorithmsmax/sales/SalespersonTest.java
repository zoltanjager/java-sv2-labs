package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {



    @Test
    void testcreateSalesperson() {
        Salesperson salesperson = new Salesperson("John Doe", 150_000, 100_000);

        assertEquals("John Doe", salesperson.getName());
        assertEquals(150_000, salesperson.getAmount());
        assertEquals(100_000, salesperson.getTarget());
        assertEquals(50_000, salesperson.getSalesDifferent());

    }

}