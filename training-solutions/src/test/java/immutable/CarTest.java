package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test

    void createCar() {
        Car car = new Car("Skoda", "Octavia", 2012);

        assertEquals("Skoda", car.getBrand());
        assertEquals("Octavia", car.getType());
        assertEquals(2012, car.getYearOfProduction());
    }

    @Test

    void testCreateWithNameIsNull() {
        Exception e = assertThrows(IllegalArgumentException.class, ()-> new Car(null, "Octavia", 2012));
        assertEquals("Brand name cannot be empty!", e.getMessage());
    }

    @Test

    void testCreateWithNameIsEmpty() {
        Exception e = assertThrows(IllegalArgumentException.class, ()-> new Car("", "Octavia", 2012));
        assertEquals("Brand name cannot be empty!", e.getMessage());
    }

    @Test

    void testCreateWithYearIsNotValid() {
        Exception e = assertThrows(IllegalArgumentException.class, ()-> new Car("Skoda", "Octavia", 2030));
        assertEquals("Year of production cannot be in the future!", e.getMessage());
    }
}