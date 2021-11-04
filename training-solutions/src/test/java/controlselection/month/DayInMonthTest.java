package controlselection.month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DayInMonthTest {

    DayInMonth dayInMonth;

    @BeforeEach
    void initDayInMonth() {
        dayInMonth = new DayInMonth();
    }


    @Test
    void testDaysInMonth () {
        assertEquals(31, dayInMonth.DaysInMonth(2021, "Január"));
        assertEquals(28, dayInMonth.DaysInMonth(2021, "Február"));
        assertEquals(30, dayInMonth.DaysInMonth(2021, "Április"));
    }

    @Test
    void testNameOfMonthNotCaseSensitive () {
        assertEquals(31, dayInMonth.DaysInMonth(2021, "jAnuÁr"));
        assertEquals(28, dayInMonth.DaysInMonth(2021, "fEbRuár"));
    }

    @Test
    void testLeapYears() {
        assertEquals(29, dayInMonth.DaysInMonth(2000, "Február"));
        assertEquals(28, dayInMonth.DaysInMonth(1900, "Február"));
        assertEquals(29, dayInMonth.DaysInMonth(2004, "Február"));
        assertEquals(28, dayInMonth.DaysInMonth(2021, "Február"));
    }

    @Test
    void testNotValidMonth() {
        assertEquals(0, dayInMonth.DaysInMonth(2021, "Januára"));
    }

}
