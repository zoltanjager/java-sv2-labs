package algorithmscount.height;

import java.util.List;

public class Height {

    public int countChildrenWithHeightGreaterThan(List<Integer> children, int limit) {
        int count = 0;

        for (int actual : children) {
            if(actual > limit){
                count++;
            }
        }
        return count;
    }
}
