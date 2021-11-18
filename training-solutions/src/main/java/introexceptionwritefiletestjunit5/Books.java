package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public void writeFormattedLines(Path path) {
        List<String> formattedLines  = formatLines();
        try {
            Files.write(path, formattedLines);
        } catch ( IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }

    private List<String> formatLines() {
        List<String> lines = getFile();
        List<String> formattedLines = new ArrayList<>();

        for (String actual: lines) {
            if (actual.length() != 0){
                {
                    formattedLines.add(actual.split(";")[2] +
                                       ": " +
                                       actual.split(";")[1]);
                }
            }
        }
        return formattedLines;
    }

    private List<String> getFile() {
        try {
            Path path = Paths.get("src/test/resources/books.txt");
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
