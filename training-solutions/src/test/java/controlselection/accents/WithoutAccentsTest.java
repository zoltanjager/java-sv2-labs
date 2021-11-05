package controlselection.accents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithoutAccentsTest {
    WithoutAccents withoutAccents;
    @BeforeEach
    void initWithoutAccents(){
        withoutAccents = new WithoutAccents();
    }

    @Test
    void testAccentLowerCaseCharacters() {
        assertEquals('o',withoutAccents.withoutAccent('ő'));
        assertEquals('o',withoutAccents.withoutAccent('ó'));
        assertEquals('a',withoutAccents.withoutAccent('á'));
        assertEquals('i',withoutAccents.withoutAccent('í'));
        assertEquals('u',withoutAccents.withoutAccent('ú'));
    }

    @Test
    void testAccentUpperCaseCharacters() {
        assertEquals('O',withoutAccents.withoutAccent('Ő'));
        assertEquals('O',withoutAccents.withoutAccent('Ó'));
        assertEquals('A',withoutAccents.withoutAccent('Á'));
        assertEquals('I',withoutAccents.withoutAccent('Í'));
        assertEquals('U',withoutAccents.withoutAccent('Ú'));
    }

    @Test
    void testWithoutAccentCharacters() {
        assertEquals('a',withoutAccents.withoutAccent('a'));
        assertEquals('p',withoutAccents.withoutAccent('p'));
    }
}
