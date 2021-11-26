package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    Zoo zoo = null;

    @BeforeEach
    void init() {
        Animal animal = new Animal("zsiráf", 4);
        Animal animal1 = new Animal("kacsa", 2);
        Animal animal2 = new Animal("pingvin", 2);
        Animal animal3 = new Animal("elefánt", 4);
        List<Animal> animals = new ArrayList(Arrays.asList(animal, animal1, animal2, animal3));
        zoo = new Zoo(animals);
    }

    @Test
    void createZoo() {

        assertEquals(4, zoo.getAnimals().size());
        assertEquals("zsiráf", zoo.getAnimals().get(0).getName());
    }

    @Test
    void addAnimal() {
        Animal animal = new Animal("tigris", 4);

        assertEquals(4, zoo.getAnimals().size());
        zoo.addAnimal(animal);
        assertEquals(5, zoo.getAnimals().size());
        assertEquals("tigris", zoo.getAnimals().get(4).getName());

    }

    @Test
    void getAnimalsWithNumberOfLegsGiven() {
        assertEquals(2, zoo.getAnimalsWithNumberOfLegsGiven(2).size());
        assertEquals("kacsa", zoo.getAnimalsWithNumberOfLegsGiven(2).get(0).getName());
        assertEquals("pingvin", zoo.getAnimalsWithNumberOfLegsGiven(2).get(1).getName());
    }

    @Test
    void getAnimals() {
        assertEquals(4, zoo.getAnimals().size());
    }
}