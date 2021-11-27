package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WomanTest {

    @Test

    void testCreateWoman() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1980, 01,12));
        Woman woman = new Woman("Kis Anna", new ArrayList<>(Arrays.asList(registerDate)));

        assertEquals("Kis Anna", woman.getName());
        assertEquals(1, woman.getRegisterDates().size());
        assertEquals(LocalDate.of(1980, 01, 12),woman.getRegisterDates().get(0).getDate());
    }
}