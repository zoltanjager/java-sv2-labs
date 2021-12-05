package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void testNext() {
        assertEquals(SeatHeaterState.STATE_3, SeatHeaterState.POWER_OFF.next());
        assertEquals(SeatHeaterState.STATE_2, SeatHeaterState.STATE_3.next());
        assertEquals(SeatHeaterState.STATE_1, SeatHeaterState.STATE_2.next());
        assertEquals(SeatHeaterState.POWER_OFF, SeatHeaterState.STATE_1.next());
    }
}