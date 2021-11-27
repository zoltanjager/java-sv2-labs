package methodpass;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void testRiseSize() {

        List<Window> windows =  Arrays.asList(new Window("Konyha", 200, 150),
                                              new Window("Nappali", 220, 200),
                                              new Window("Fürdő", 50,50));

        WindowOperation windowOperation = new WindowOperation();

        windowOperation.riseSize(windows,20);

        assertEquals(220,windows.get(0).getWidth());
        assertEquals(170,windows.get(0).getHeight());
        assertEquals(70,windows.get(2).getWidth());
        assertEquals(70,windows.get(2).getHeight());

    }
}