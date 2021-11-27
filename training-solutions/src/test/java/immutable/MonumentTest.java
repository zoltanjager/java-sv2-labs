package immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MonumentTest {

    @Test

    void createMonument() {
        Monument monument = new Monument("Templom", "Templom tér 2", LocalDate.of(2019, 02, 03), "RN-123456");

        assertEquals("Templom", monument.getName());
        assertEquals("Templom tér 2", monument.getAddress());
        assertEquals(LocalDate.of(2019, 02, 03), monument.getDateOfRegistration());
        assertEquals("RN-123456", monument.getRegistrationNumber());
    }


    @Test
    void testCreateWithNameIsEmpty() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->
                        new Monument("", "Templom tér 2",
                        LocalDate.of(2019, 02, 03), "RN-123456"));
        assertEquals("Name, address or registry number cannot be empty!", e.getMessage());
    }

    @Test
    void testCreateWithAddressIsEmpty() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->
                new Monument("Templom", "",
                        LocalDate.of(2019, 02, 03), "RN-123456"));
        assertEquals("Name, address or registry number cannot be empty!", e.getMessage());
    }

    @Test
    void testCreateWithRegistrationNumberIsEmpty() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->
                new Monument("Templom", "Templom tér 2",
                        LocalDate.of(2019, 02, 03), ""));
        assertEquals("Name, address or registry number cannot be empty!", e.getMessage());
    }

    @Test
    void testCreateWithNameIsNull() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->
                new Monument(null, "Templom tér 2",
                        LocalDate.of(2019, 02, 03), "RN-123456"));
        assertEquals("Name, address or registry number cannot be empty!", e.getMessage());
    }

    @Test
    void testCreateWithAddressIsNull() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->
                new Monument("Templom", null,
                        LocalDate.of(2019, 02, 03), "RN-123456"));
        assertEquals("Name, address or registry number cannot be empty!", e.getMessage());
    }

    @Test
    void testCreateWithRegistrationNumberIsNull() {
        Exception e = assertThrows(IllegalArgumentException.class, ()->
                new Monument("Templom", "Templom tér 2",
                        LocalDate.of(2019, 02, 03), null));
        assertEquals("Name, address or registry number cannot be empty!", e.getMessage());
    }


}