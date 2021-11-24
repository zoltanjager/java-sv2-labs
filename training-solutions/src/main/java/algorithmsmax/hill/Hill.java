package algorithmsmax.hill;

import java.util.List;

public class Hill {

    public int getMax(List<Integer> hills) {
        int max = hills.get(0);
        for (int actual : hills) {
            if (actual > max) {
                max = actual;
            }
        }
        return max;
    }
}
