package lambdacollectors.christmastree;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ChristmasTreeFair {
    private List<ChristmasTree> trees;

    public ChristmasTreeFair(List<ChristmasTree> trees) {
        this.trees = trees;
    }

    public Map<PineTreeType, Long> getCountByType() {
        return trees.stream()
                .collect(Collectors.groupingBy(ChristmasTree::getType, Collectors.counting()));
    }

    public double getMaxHeightByType(PineTreeType type) {
        Optional<ChristmasTree> result = trees.stream()
                .filter(christmasTree -> christmasTree.getType().equals(type))
                .collect(Collectors.maxBy(Comparator.comparing(ChristmasTree::getHeight)));
        if (result.isPresent()) {
            return result.get().getHeight();
        }
        return 0.0;
    }

    public double getAveragePrice() {
        return trees.stream()
                .collect(Collectors.averagingInt(christmasTree -> christmasTree.getType().getPricePerMeter()));
    }
}
