package inheritanceattributes.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    ShippedBook shippedBook;

    @BeforeEach
    void init() {
        shippedBook = new ShippedBook("Egri csillagok", 500, 300);
    }

    @Test

    void createShippedBook() {

        assertEquals("Egri csillagok", shippedBook.getTitle());
        assertEquals(500, shippedBook.getPrice());
        assertEquals(300, shippedBook.getShippingCost());
    }

    @Test

    void testOrder() {

        assertEquals(1300, shippedBook.order(2));

    }

    @Test

    void testPurchase() {
        assertEquals(1000, shippedBook.purchase(2));
    }

    @Test

    void testToString() {

        assertEquals("Egri csillagok: 500Ft, postaköltség: 300Ft", shippedBook.toString());
    }
}