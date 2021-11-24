package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testContainsLongerWord() {
        List<String> words = Arrays.asList( "Almafa", "Körtefa", "Szilvafa", "Cseresznyefa");

        Word word = new Word();

        assertTrue(word.containsLongerWord(words, "Meggyfa"));
        assertFalse(word.containsLongerWord(words, "JapánMeggyfa"));
    }
}