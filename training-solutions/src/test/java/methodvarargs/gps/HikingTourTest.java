package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {

    HikingTour hikingTour = new HikingTour();


    @Test
    void testLogFieldPoints() {
        hikingTour.logFieldPoints(LocalDateTime.of(2021, 11, 28, 10, 30),
                new FieldPoint(LocalDateTime.of(2021, 11, 28, 10, 30), -47.343434, 45.343434),
                new FieldPoint(LocalDateTime.of(2021, 11, 28, 10, 31), -47.343445, 45.343444),
                new FieldPoint(LocalDateTime.of(2021, 11, 28, 10, 32), -47.343455, 45.343454),
                new FieldPoint(LocalDateTime.of(2021, 11, 28, 10, 33), -47.343465, 45.343464));

        assertEquals(4, hikingTour.getFieldPointList().size());
        assertEquals(LocalDateTime.of(2021, 11, 28, 10, 30), hikingTour.getFieldPointList().get(3).getTimeOfLogging());
        assertEquals(-47.343465, hikingTour.getFieldPointList().get(3).getLatitude());
        assertEquals(45.343464, hikingTour.getFieldPointList().get(3).getLongitude());
    }

    @Test
    void testLogFieldPointsWithNullTimeOfLogging() {

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                ()-> hikingTour.logFieldPoints(null,
                new FieldPoint(LocalDateTime.of(2021, 11, 28, 10, 30), -47.343434, 45.343434),
                new FieldPoint(LocalDateTime.of(2021, 11, 28, 10, 31), -47.343445, 45.343444)));

        assertEquals("Üres időpont!", e.getMessage());
    }
}