package lambdastreams.baseoperations;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Operations {
    private List<Integer> numbers;

    public Operations(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public Optional<Integer> min() {
        return numbers.stream().min(Comparator.comparingInt(n -> n));
    }

    public Integer sum(){
        return numbers.stream().mapToInt(n -> n).sum();
    }

    public boolean isAllPositive(){
        return numbers.stream().allMatch(n -> n > 0);
    }

    public Set<Integer> getDistinctElements(){
        return numbers.stream().collect(Collectors.toSet());
    }
}
