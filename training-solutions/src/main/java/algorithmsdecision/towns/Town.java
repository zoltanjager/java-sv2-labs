package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> towns, int population) {
        for (int actual : towns ) {
            if (actual < population) {
                return true;
            }
        }
        return false;
    }
}
