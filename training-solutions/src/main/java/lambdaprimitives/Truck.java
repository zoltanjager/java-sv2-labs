package lambdaprimitives;

import java.util.*;

public class Truck {
    private List<Cargo> thingsToLoad;

    public Truck(List<Cargo> thingsToLoad) {
        this.thingsToLoad = thingsToLoad;
    }

    public double getShortestLength() {
        OptionalDouble shortestLength = thingsToLoad.stream()
                .mapToDouble(Cargo::getLength)
                .min();

        if (shortestLength.isPresent()) {
            return shortestLength.getAsDouble();
        }
        return 0.0;
    }

    public int getTotalWeight() {
        return thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .sum();
    }

    public double getAverageWeight() {
        OptionalDouble averageWeight = thingsToLoad.stream()
                .mapToDouble(Cargo::getWeight)
                .average();

        return averageWeight.orElseThrow(() -> new IllegalArgumentException("No cargo."));
    }

    public int getMaxWeight() {
        OptionalInt maxWeight = thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .max();

        return maxWeight.orElse(0);
    }

    public String getWeightStatistics() {
        IntSummaryStatistics stats = thingsToLoad.stream()
                .mapToInt(Cargo::getWeight)
                .summaryStatistics();


        if (stats.getCount() > 0) {
            return String.format("A rakományban található %d tétel, melyeknek összsúlya %d kg," +
                            " közülük a legnehezebb %d kg, a legkönnyebb %d kg. A súlyuk átlagosan %.1f kg.",
                    stats.getCount(), stats.getSum(), stats.getMax(), stats.getMin(), stats.getAverage());
        } else {
            return "No cargo.";
        }
    }
}

