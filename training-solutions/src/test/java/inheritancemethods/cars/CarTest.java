package inheritancemethods.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test

    void testCreateCar() {

        Car car = new Car(5.0, 20.0, 50);

        assertEquals(5, car.getFuelRate());
        assertEquals(20, car.getFuel());
        assertEquals(50, car.getTankCapacity());
    }

    @Test

    void modifyFuelAmount() {

        Car car = new Car(5.0, 20.0, 50);

        car.modifyFuelAmount(-5.5);
        assertEquals(14.5, car.getFuel());
    }

    @Test

    void isFuelAvailable() {

        Car car = new Car(5.0, 20.0, 50);

        assertTrue(car.isFuelAvailable(250));
        assertFalse(car.isFuelAvailable(500));
    }

    @Test

    void testDrive() {

        Car car = new Car(5.0, 20.0, 50);

        car.drive(250);
        assertEquals(7.5, car.getFuel());
    }

    @Test

    void calculateRefillAmount() {

        Car car = new Car(5.0, 20.0, 50);

        assertEquals(30, car.calculateRefillAmount());
    }
}