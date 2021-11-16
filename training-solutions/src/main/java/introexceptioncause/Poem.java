package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Poem {

    public static void main(String[] args) {
        List<String> poem = new ArrayList<>();
        try {
            poem = new Poem().readPoem();
            System.out.println(poem);
        }
        catch (IllegalStateException ise) {
            ise.printStackTrace();
            ise.getCause().printStackTrace();
        }
        for (String actual: poem) {
            System.out.println(actual.charAt(0));
        }
    }

    public List<String> readPoem() {
        try {
            return Files.readAllLines(Paths.get("src/main/resources/poem.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
