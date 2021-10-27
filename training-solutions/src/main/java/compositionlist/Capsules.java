package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors= new ArrayList<>();

    public void addLast(String capsule) {
        colors.add(capsule);
    }

    public void addFirst(String capsule) {
        colors.add(0, capsule);
    }

    public void removeFirst() {
        colors.remove(0);
    }

    public void removeLast() {
        colors.remove(colors.size()-1);
    }

    public List<String> getColors() {
        return colors;
    }
}
