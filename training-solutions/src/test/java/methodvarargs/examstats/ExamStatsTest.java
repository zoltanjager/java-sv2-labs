package methodvarargs.examstats;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats examStats;

    @Test

    void testGetNumberOfTopGrades() {
        this.examStats = new ExamStats(100);

        assertEquals(2, examStats.getNumberOfTopGrades(90, 10, 20, 30, 89, 90, 91, 100));
        assertEquals(0, examStats.getNumberOfTopGrades(90, 10, 20, 30, 90));
    }

    @Test

    void testGetNumberOfTopGradesWithoutResults() {
        this.examStats = new ExamStats(100);

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> examStats.getNumberOfTopGrades(90));

        assertEquals("Az eredmények listája nem lehet üres!", e.getMessage());
    }

    @Test

    void testGetNumberOfTopGradesWithNullResults() {
        this.examStats = new ExamStats(100);

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> examStats.getNumberOfTopGrades(90, null));

        assertEquals("Az eredmények listája nem lehet üres!", e.getMessage());
    }

    @Test

    void testHasAnyFailed() {
        this.examStats = new ExamStats(100);

        assertTrue(examStats.hasAnyFailed(75, 74, 90));
        assertFalse(examStats.hasAnyFailed(75, 75, 90));
    }

    @Test

    void testHasAnyFailedWithoutResults() {
        this.examStats = new ExamStats(100);

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> examStats.hasAnyFailed(90));

        assertEquals("Az eredmények listája nem lehet üres!", e.getMessage());
    }

    @Test

    void testHasAnyFailedWithNullResults() {
        this.examStats = new ExamStats(100);

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> examStats.hasAnyFailed(90, null));

        assertEquals("Az eredmények listája nem lehet üres!", e.getMessage());
    }
}