package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void getNumberOfAnimals() {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Duck());
        animals.add(new Duck());
        animals.add(new Lion());
        animals.add(new Worm());
        animals.add(new Worm());

        Zoo zoo = new Zoo(animals);

        assertEquals(5, zoo.getNumberOfAnimals());
    }

    @Test
    void getNumberOfAllLegs() {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Duck());
        animals.add(new Duck());
        animals.add(new Lion());
        animals.add(new Worm());
        animals.add(new Worm());

        Zoo zoo = new Zoo(animals);

        assertEquals(8,zoo.getNumberOfAllLegs());

    }
}