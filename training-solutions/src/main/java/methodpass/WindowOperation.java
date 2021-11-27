package methodpass;

import java.util.List;

public class WindowOperation {
    public void riseSize(List<Window> windows, int plusSize) {
        for (Window actual : windows) {
            actual.setWidth(actual.getWidth() + plusSize);
            actual.setHeight(actual.getHeight() + plusSize);
        }
    }
}
