package objectclass.bag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleBagTest {

    @Test

    void testCreate() {
        SimpleBag simpleBag = new SimpleBag();

        assertTrue(simpleBag.isEmpty());
        assertEquals(0, simpleBag.size());
    }

    @Test

    void testPutItem() {
        SimpleBag simpleBag = new SimpleBag();

        simpleBag.putItem(new Book("Gárdonyi Géza", "Egri csillagok"));
        simpleBag.putItem(new Beer("Gosser", 250));
        simpleBag.putItem("egy szó");
        simpleBag.putItem(22);

        assertEquals(4, simpleBag.size());
        assertFalse(simpleBag.isEmpty());
    }

    @Test

    void testHasNext() {

        SimpleBag simpleBag = new SimpleBag();
        simpleBag.putItem(new Book("Gárdonyi Géza", "Egri csillagok"));
        simpleBag.putItem(new Beer("Gosser", 250));
        simpleBag.putItem(new Beer("Dreher", 259));

        while(simpleBag.hasNext()){
        simpleBag.next();
        }

        assertEquals(2, simpleBag.getCursor());
    }

    @Test

    void testNext() {

        SimpleBag simpleBag = new SimpleBag();
        simpleBag.putItem(new Book("Gárdonyi Géza", "Egri csillagok"));
        simpleBag.putItem(new Beer("Gosser", 250));
        simpleBag.putItem(new Beer("Dreher", 259));

        assertEquals(simpleBag.next(), new Book("Gárdonyi Géza", "Egri csillagok"));
        assertEquals(simpleBag.next(), new Beer("Gosser", 250));
    }


    @Test

    void testContains() {

        SimpleBag simpleBag = new SimpleBag();
        simpleBag.putItem(new Book("Gárdonyi Géza", "Egri csillagok"));
        simpleBag.putItem(new Beer("Gosser", 250));
        simpleBag.putItem(new Beer("Dreher", 259));

        assertTrue(simpleBag.contains(new Beer("Gosser", 250)));
        assertFalse(simpleBag.contains(new Beer("Soproni", 250)));
    }

    @Test
    void contains() {
    }

    @Test
    void getCursor() {
    }
}