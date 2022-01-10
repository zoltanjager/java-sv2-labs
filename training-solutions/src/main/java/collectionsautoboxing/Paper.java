package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    private Map<String, Integer> paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return new HashMap<>(paper);
    }

    public void putFurtherPaper(String className, int kilogramms) {
        if (!paper.containsKey(className)) {
            paper.put(className, 0);
        }
        paper.put(className, paper.get(className) + kilogramms);
    }

    public String getWinnerClass() {
        int max = Integer.MIN_VALUE;
        for (Integer actual : paper.values()) {
            if (actual > max) {
                max = actual;
            }
        }
        String result = "";
        for (Map.Entry entry : paper.entrySet()) {
            if (max == (Integer) entry.getValue()) {
                result = entry.getKey().toString();
            }
        }
        return result;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (int actual : paper.values()) {
            sum += actual;
        }
        return sum;
    }
}
