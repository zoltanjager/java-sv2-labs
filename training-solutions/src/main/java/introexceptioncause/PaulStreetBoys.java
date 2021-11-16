package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PaulStreetBoys {
    public static void main(String[] args) {
        PaulStreetBoys paulStreetBoys = new PaulStreetBoys();
        paulStreetBoys.writePaulStreetBoys(paulStreetBoys.readPaulStreetBoys());
    }


    public List<String> readPaulStreetBoys() {
    List<String> paulStreetBoys = new ArrayList<>();
    try {
            paulStreetBoys = Files.readAllLines(Paths.get("src/main/resources/palutcaifiuk.txt"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return paulStreetBoys;
    }

    public void writePaulStreetBoys(List<String> paulStreetBoys) {
        for (String actual: paulStreetBoys) {
            if (actual.equals("Nemecsek Ernő")) {
                System.out.println(actual.toLowerCase());
            } else {
                System.out.println(actual);
            }
        }
    }
}
