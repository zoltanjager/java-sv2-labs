package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RegisterDateTest {

    @Test

    void testCreateRegisterDate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1980, 01, 12));

        assertEquals("születés ideje", registerDate.getDescription());
        assertEquals(LocalDate.of(1980, 01, 12), registerDate.getDate());
    }


}