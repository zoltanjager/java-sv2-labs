package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {
    Tank tank = new Tank();

    @Test
    public void testGetAngle() {
        tank.modifyAngle(25);
        tank.modifyAngle(-10);

        assertEquals(15, tank.getAngle());
    }

    @Test
    public void testGetAngleException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(90));
        assertEquals("Elérted a maximális fordulási értéket!", exception.getMessage());
    }

}
