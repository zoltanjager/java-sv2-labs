package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {

    public List<String> readTrackPoints() {
        List<String> trackPoints = new ArrayList<>();
        try {
            trackPoints = Files.readAllLines(Paths.get("src/main/resources/tracking.csv"));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return trackPoints;
    }

    public void processTrackPoints(List<String> trackPoints) {
        List<Integer> altitudes = new ArrayList<>();

        for (String actual: trackPoints) {
           int altitude = Integer.parseInt(actual.split(";")[2]);
           altitudes.add(altitude);
        }

        for (int i = 0; i < altitudes.size() - 1; i++) {
            System.out.println(altitudes.get(i + 1) - altitudes.get(i));
        }
    }
}
