package statemachine.seatheater;

public enum SeatHeaterState {

    POWER_OFF {
        SeatHeaterState next() {
            return SeatHeaterState.STATE_3;
        }
    },

    STATE_3 {
        SeatHeaterState next() {
            return SeatHeaterState.STATE_2;
        }
    },

    STATE_2 {
        SeatHeaterState next() {
            return SeatHeaterState.STATE_1;
        }
    },

    STATE_1 {
        SeatHeaterState next() {
            return SeatHeaterState.POWER_OFF;
        }
    };

    abstract SeatHeaterState next();
}
