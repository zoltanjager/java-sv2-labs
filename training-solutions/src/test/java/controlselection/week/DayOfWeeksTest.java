package controlselection.week;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {
    DayOfWeeks dayOfWeeks;

    @BeforeEach
    void initDayOfWeeks() {
        dayOfWeeks = new DayOfWeeks();
    }

    @Test
    void testBeginningOfTheWeek() {
        assertEquals("hét eleje", dayOfWeeks.dayOfWeek("hétfő"));
    }

    @Test
    void testMiddleOfTheWeek() {
        assertEquals("hét közepe",dayOfWeeks.dayOfWeek("kedd"));
        assertEquals("hét közepe",dayOfWeeks.dayOfWeek("szerda"));
        assertEquals("hét közepe",dayOfWeeks.dayOfWeek("csütörtök"));
    }

    @Test
    void testAlmostWeekend() {
        assertEquals("majdnem hétvége", dayOfWeeks.dayOfWeek("péntek"));
    }

    @Test
    void testWeekend() {
        assertEquals("hétvége", dayOfWeeks.dayOfWeek("szombat"));
        assertEquals("hétvége", dayOfWeeks.dayOfWeek("vasárnap"));
    }

    @Test
    void testInvalidDay() {
        assertEquals("ismeretlen nap", dayOfWeeks.dayOfWeek("dffdf"));
    }

    @Test
    void testDayOfWeekNotCaseSensitive() {
        assertEquals("hétvége", dayOfWeeks.dayOfWeek("SZoMbaT"));
        assertEquals("hét eleje", dayOfWeeks.dayOfWeek("HÉTFŐ"));
    }
}
