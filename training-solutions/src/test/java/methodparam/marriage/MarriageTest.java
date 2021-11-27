package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void testGetMarried() {

        Man man = new Man("Kis Péter", new ArrayList<>(Arrays.asList(
                new RegisterDate("születés ideje", LocalDate.of(1980, 02,12)))));
        Woman woman = new Woman("Kis Anna", new ArrayList<>(Arrays.asList(
                new RegisterDate("születés ideje", LocalDate.of(1980, 01,12)))));

        Marriage marriage = new Marriage();
        marriage.getMarried(woman, man);

        assertEquals("Kisné Kis Anna", woman.getName());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(1).getDate());
    }
}