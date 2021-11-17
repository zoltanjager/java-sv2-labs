package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsTest {

    Words words = new Words();

    @Test

    public void testGetFirstWordWithA() {
        Path path = Paths.get("src/test/resources/words.txt");
        String firstWord = words.getFirstWordWithA(path);

        assertEquals("Anna", firstWord);
    }

    @Test

    public void testGetFirstWordWithANoWordWithA() {
        Path path = Paths.get("src/test/resources/nowordwitha.txt");
        String firstWord = words.getFirstWordWithA(path);

        assertEquals("A", firstWord);
    }

    @Test

    public void testGetFirstWordWithAFileNotExist() {
        Path path = Paths.get("src/test/resources/aaaa.txt");

        IllegalStateException exception = assertThrows(IllegalStateException.class,
                () -> words.getFirstWordWithA(path));
        assertEquals("Can not read file", exception.getMessage());
    }

}
