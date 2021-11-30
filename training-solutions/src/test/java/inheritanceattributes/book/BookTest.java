package inheritanceattributes.book;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test

    void testCreateBook() {
        Book book = new Book("Egri csillagok", 500);

        assertEquals("Egri csillagok", book.getTitle());
        assertEquals(500, book.getPrice());
    }


    @Test
    void testPurchase() {

        Book book = new Book("Egri csillagok", 500);

        assertEquals(1000,book.purchase(2));
    }
}