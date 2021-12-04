package interfacedefaultmethods.longword;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public interface FileOperations {
    default List<String> readFromFile(Path path) {
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
            System.out.println(lines);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return lines;
    }

    String getLongWord();
}
