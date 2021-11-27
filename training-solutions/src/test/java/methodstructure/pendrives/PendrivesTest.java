package methodstructure.pendrives;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PendrivesTest {

    List<Pendrive> listOfPendrives = Arrays.asList(new Pendrive("Pendrive1", 8, 5000),
                                                   new Pendrive("Pendrive2", 16, 6000),
                                                   new Pendrive("Pendrive3", 32, 8000));


    @Test
    void testGetBest() {

        Pendrives pendrives = new Pendrives();
        assertEquals(listOfPendrives.get(2), pendrives.getBest(listOfPendrives));
    }

    @Test
    void getCheapest() {

        Pendrives pendrives = new Pendrives();
        assertEquals(listOfPendrives.get(0), pendrives.getCheapest(listOfPendrives));
    }

    @Test
    void risePriceWhereCapacity() {

        Pendrives pendrives = new Pendrives();

        pendrives.risePriceWhereCapacity(listOfPendrives, 10, 8);
        assertEquals(5500, listOfPendrives.get(0).getPrice());
    }
}