package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    public void testSayHello() {
        String name = "John Doe";

        String greeting = new Gentleman().sayHello(name);

        assertEquals("Hello John Doe!", greeting);
    }

    @Test
    public void testSayHelloNull() {
        String name = null;

        String greeting = new Gentleman().sayHello(name);

        assertEquals("Hello Anonymous!", greeting);
    }

}
