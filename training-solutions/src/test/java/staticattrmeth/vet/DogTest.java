package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test

    void testCreate() {

        Dog dog = new Dog("Hopy", 7, Species.MIXTURE);

        assertEquals("Hopy", dog.getName());
        assertEquals(7, dog.getAge());
        assertEquals(Species.MIXTURE, dog.getSpecies());
        assertEquals(0L, dog.getCodeNumber());
    }

}