package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {
    @Test
        void testGreetings() {
            Greetings greetings = new Greetings();
            assertEquals("Jó reggelt!", greetings.greeting(5,30));
            assertEquals("Jó éjt!", greetings.greeting(21,30));
            assertEquals("Jó napot!", greetings.greeting(9,30));
            assertEquals("Jó napot!", greetings.greeting(18,30));
            assertEquals("Jó estét!", greetings.greeting(19,30));
            assertEquals("Jó estét!", greetings.greeting(18,31));
            }
        }

