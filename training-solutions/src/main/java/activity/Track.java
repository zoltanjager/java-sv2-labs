package activity;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void loadFromGpx(Path path) {

        try (BufferedReader br = Files.newBufferedReader(path)) {

            String line;

            while ((line = br.readLine()) != null) {
                String secondLine;
                if (isCoordinate(line)) {
                    secondLine = br.readLine();
                    addTrackPoint(processingLine(line, secondLine));
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not exist");
        }
    }


    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }

    public double getFullElevation() {

        double[] elevations = trackPoints.stream()
                .mapToDouble(TrackPoint::getElevation)
                .toArray();
        int fullElevation = 0;
        for (int i = 1; i < elevations.length; i++) {
            fullElevation += Math.max(elevations[i] - elevations[i - 1], 0);
        }
        return fullElevation;
    }

    public double getFullDecrease() {

        double[] elevations = trackPoints.stream()
                .mapToDouble(TrackPoint::getElevation)
                .toArray();
        int fullDecrease = 0;
        for (int i = 1; i < elevations.length; i++) {
            fullDecrease += Math.min(elevations[i] - elevations[i - 1], 0);
        }
        return Math.abs(fullDecrease);


    }

    public Coordinate findMinimumCoordinate() {
        double lat = trackPoints.stream()
                .map(TrackPoint::getCoordinate)
                .mapToDouble(Coordinate::getLatitude)
                .min()
                .getAsDouble();
        double lon = trackPoints.stream()
                .map(TrackPoint::getCoordinate)
                .mapToDouble(Coordinate::getLongitude)
                .min()
                .getAsDouble();

        return new Coordinate(lat, lon);
    }

    public Coordinate findMaximumCoordinate() {
        double lat = trackPoints.stream()
                .map(TrackPoint::getCoordinate)
                .mapToDouble(Coordinate::getLatitude)
                .max()
                .getAsDouble();
        double lon = trackPoints.stream()
                .map(TrackPoint::getCoordinate)
                .mapToDouble(Coordinate::getLongitude)
                .max()
                .getAsDouble();

        return new Coordinate(lat, lon);


    }

    public double getRectangleArea() {
        return (findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude()) *
                (findMaximumCoordinate().getLongitude() - findMinimumCoordinate().getLongitude());
    }

    public double getDistance() {
        double sum = 0;
        for (int i = 1; i < trackPoints.size(); i++) {
            sum += trackPoints.get(i - 1).getDistanceFrom(trackPoints.get(i));
        }
        return sum;
    }

    private TrackPoint processingLine(String line, String secondLine) {
        double lat = 0;
        double lon = 0;
        double elevation = 0;

        if (isCoordinate(line)) {
            lat = Double.parseDouble(line.substring(15, 25));
            lon = Double.parseDouble(line.substring(32, 42));
        }
        if (isTrackPoint(secondLine)) {
            elevation = Double.parseDouble(secondLine.substring(9, 14));
            return new TrackPoint(new Coordinate(lat, lon), elevation);
        }
        return null;
    }


    private boolean isCoordinate(String line) {
        return line.contains("<trkpt");
    }

    private boolean isTrackPoint(String line) {
        return line.contains("<ele");
    }


}
