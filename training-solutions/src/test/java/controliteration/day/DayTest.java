package controliteration.day;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayTest {

    Day day;

    @BeforeEach
    void initDay() {
        day = new Day();
        day.addHour(new Hour(3));
        day.addHour(new Hour(7));
        day.addHour(new Hour(15));
        day.addHour(new Hour(20));
        day.addHour(new Hour(23));
    }

    @Test
    void testSetDayPeriod() {
        day.setDayPeriod();

        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(0).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(1).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(2).getPeriod());
        assertEquals(DayPeriod.DAYTIME, day.getHoursOfDay().get(3).getPeriod());
        assertEquals(DayPeriod.NIGHTTIME, day.getHoursOfDay().get(4).getPeriod());


    }
}
