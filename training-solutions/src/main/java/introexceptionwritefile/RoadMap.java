package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {

    public static void main(String[] args) {

        List<String> roadmap = Arrays.asList("Budapest", "Dunaújváros", "Pécs", "Barcs");
        try {
            Files.write(Paths.get("roadmap.txt"), roadmap);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
