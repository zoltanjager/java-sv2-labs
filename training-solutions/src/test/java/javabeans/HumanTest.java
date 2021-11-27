package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {


    @Test
    void testSetName() {
        Human human = new Human();
        human.setName("John Doe");
        assertEquals("John Doe", human.getName());
    }

    @Test
    void testSetWeight() {
        Human human = new Human();
        human.setWeight(82.2);
        assertEquals(82.2, human.getWeight());
    }

    @Test
    void testSetIq() {
        Human human = new Human();
        human.setIq(125);
        assertEquals(125, human.getIq());
    }
}