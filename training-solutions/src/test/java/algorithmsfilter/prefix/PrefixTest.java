package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    @Test
    void testGetWordsStartWith() {

        Prefix prefix = new Prefix();
        List<String> words = Arrays.asList("ablak", "ablakkeret", "ablaküveg", "ajtó", "szekrény");

        List<String> filteredWords = prefix.getWordsStartWith(words, "ablak");

        assertEquals(3, filteredWords.size());
        assertTrue(filteredWords.contains("ablak"));
        assertFalse(filteredWords.contains("ajtó"));
    }

}