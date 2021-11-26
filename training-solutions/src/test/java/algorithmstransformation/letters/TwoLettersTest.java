package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoLettersTest {

    @Test
    void testGetFirstTwoLetters() {
        List<String> words = Arrays.asList("alma", "körte", "szilva", "eper");
        TwoLetters twoLetters = new TwoLetters();

        List<String> expected = Arrays.asList("al", "kö", "sz", "ep");
        assertEquals(expected, twoLetters.getFirstTwoLetters(words));

    }
}