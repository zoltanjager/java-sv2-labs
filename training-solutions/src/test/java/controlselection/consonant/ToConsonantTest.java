package controlselection.consonant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToConsonantTest {
    ToConsonant consonant;

    @BeforeEach
    void initToConsonant() {
        consonant = new ToConsonant();
    }

    @Test
    void testVowels() {
        assertEquals('f',consonant.Consonant('e'));
        assertEquals('b',consonant.Consonant('a'));
        assertEquals('j',consonant.Consonant('i'));
        assertEquals('p',consonant.Consonant('o'));
    }

    @Test
    void testConsonant() {
        assertEquals('p',consonant.Consonant('p'));
        assertEquals('k',consonant.Consonant('k'));
    }
}
