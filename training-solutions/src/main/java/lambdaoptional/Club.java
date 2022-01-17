package lambdaoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {
    private List<Member> members = new ArrayList<>();

    public Club(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate) {
        for (Member actual : members) {
            if (predicate.test(actual)) {
                return Optional.of(actual);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills() {
        if (members.isEmpty()) {
            return Optional.empty();
        }
        int numberOfSkills = 0;
        for (Member actual : members) {
            numberOfSkills += actual.getSkills().size();
        }
        return Optional.of((double) numberOfSkills / members.size());
    }

}
