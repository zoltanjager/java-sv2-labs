package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WordsTest {
    Words words;

    @BeforeEach
    void initWords() {
        words = new Words();
        words.addWord("alma");
        words.addWord("ajtó");
        words.addWord("ablak");
        words.addWord("autó");
        words.addWord("körte");
        words.addWord("kert");
        words.addWord("kalap");
        words.addWord("kabát");
    }

    @Test
    void testGetWordsStartWith() {
        List<String> expectedWords = Arrays.asList("körte", "kert", "kalap","kabát");
        words.getWordsStartWith("k");
        assertEquals(expectedWords,words.getWords());
    }

    @Test
    void testGetWordsWithLength() {
        List<String> expectedWords = Arrays.asList("alma", "ajtó", "autó","kert");
        words.getWordsWithLength(4);
        assertEquals(expectedWords, words.getWords());
    }

}
