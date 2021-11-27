package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ManTest {

    @Test

    void testCreateMan() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1980, 02,12));
        Man man = new Man("Kis Péter", new ArrayList<>(Arrays.asList(registerDate)));

        assertEquals("Kis Péter", man.getName());
        assertEquals(1, man.getRegisterDates().size());
        assertEquals(LocalDate.of(1980, 02, 12),man.getRegisterDates().get(0).getDate());
    }
}