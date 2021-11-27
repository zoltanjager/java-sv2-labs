package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void testSetName() {
        Dog dog = new Dog();
        dog.setName("Hopy");
        assertEquals("Hopy", dog.getName());
    }

    @Test
    void setAge() {
        Dog dog = new Dog();
        dog.setAge(8);
        assertEquals(8, dog.getAge());
    }

    @Test
    void setPedigree() {
        Dog dog = new Dog();
        dog.setPedigree(false);
        assertFalse(dog.isPedigree());
    }

    @Test
    void setWeight() {
        Dog dog = new Dog();
        dog.setWeight(6);
        assertEquals(6, dog.getWeight());
    }
}