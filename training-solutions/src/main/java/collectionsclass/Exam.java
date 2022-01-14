package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam {
    private List<ExamResult> results;

    public Exam(List<ExamResult> results) {
        this.results = results;
    }

    public List<String> getNamesOfSucceededPeople(int places) {
        List<String> result = new ArrayList<>();
        if (results.size() < places) {
            throw new IllegalArgumentException("Wrong number");
        }

        List<ExamResult> ordered = new ArrayList<>(results);
        Collections.sort(ordered);
        Collections.reverse(ordered);
        for (int i = 0; i < places; i++) {
            result.add(ordered.get(i).getName());
        }
        return result;
    }
}
