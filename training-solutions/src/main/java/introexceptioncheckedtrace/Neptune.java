package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptune {
    public static void main(String[] args) {

        Neptune neptune = new Neptune();
        try {
            System.out.println(neptune.getNeptunCodes(neptune.readNeptunFile()));
        }
        catch (IOException ioe) {
            System.out.println("Nincs ilyen file");
        }

    }

    public List<String> getNeptunCodes (List<String> neptunData) {
        List<String> neptunCodes = new ArrayList<>();
        for (String actual: neptunData) {
            neptunCodes.add(actual.split(",")[1]);
        }
        return neptunCodes;
    }

    private List<String> readNeptunFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/neptun.csv"));
    }
}
