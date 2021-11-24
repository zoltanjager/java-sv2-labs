package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {

    List<Salesperson> salesPersons = Arrays.asList(new Salesperson("John Doe", 150_000, 100_000),
                                                   new Salesperson("Jack Doe", 350_000, 100_000),
                                                   new Salesperson("Bill Doe", 250_000, 100_000),
                                                   new Salesperson("Jane Doe", 120_000, 200_000),
                                                   new Salesperson("Tom Doe", 450_000, 300_000),
                                                   new Salesperson("Jerry Doe", 50_000, 100_000));

    Sales sales = new Sales();

    @Test
    void testSelectSalesPersonWithMaxSalesAmount() {
        assertEquals(salesPersons.get(4), sales.selectSalesPersonWithMaxSalesAmount(salesPersons));
    }

    @Test
    void testSelectSalesPersonWithFurthestAboveTarget() {
        assertEquals(salesPersons.get(1), sales.selectSalesPersonWithFurthestAboveTarget(salesPersons));
    }

    @Test
    void testSelectSalesPersonWithFurthestBelowTarget() {
        assertEquals(salesPersons.get(3), sales.selectSalesPersonWithFurthestBelowTarget(salesPersons));
    }
}