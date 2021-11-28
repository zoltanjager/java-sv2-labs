package staticattrmeth.vet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test

    void testAddDog() {
        Vet firstVet = new Vet();

        firstVet.addDog(new Dog("Hopy", 7, Species.MIXTURE));
        firstVet.addDog(new Dog("Pitypang", 2, Species.GOLDEN_RETRIEVER));

        Vet secondVet = new Vet();
        secondVet.addDog(new Dog("Hector", 4, Species.MIXTURE));
        secondVet.addDog(new Dog("Blöki", 3, Species.LABRADOR));

        firstVet.addDog(new Dog("Morzsi", 5, Species.BEAGLE));
        secondVet.addDog(new Dog("Csutak", 9, Species.POINTER));

        long number = secondVet.getDogs().get(2).getCodeNumber();

        assertEquals(6L, number);
    }


}