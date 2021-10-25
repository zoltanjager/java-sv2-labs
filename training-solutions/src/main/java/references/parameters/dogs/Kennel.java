package references.parameters.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();

        Dog dog = new Dog("Blöki", 2, "brown");
        Dog dog2 = new Dog("Hopy", 7, "brown");
        Dog dog3= new Dog("Pitypang", 1, "brown");

        dogs.add(dog);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs.toString());

        Dog dog4 = dogs.get(1);
        dog4.setColour("black");

        System.out.println(dogs.toString());

        Dog dog5 = new Dog("Morzsi", 3, "white");

        System.out.println(dog5.toString());
        dog5 = dogs.get(1);
        System.out.println(dog5.toString());
        dogs.add(dog5);
        System.out.println(dogs.toString());

        Dog dog6 = dog4;
        dog6.setColour("red");
        System.out.println(dogs.toString());

        List<Dog> dogs2 = dogs;

        Dog dog7 = dog4;
        dog7.setColour("blue");

        System.out.println(dogs2.toString());

        dog2 = null;

        System.out.println(dogs2.toString());

        Dog dog8 =dogs.get(1);
        dog8 = null;

        System.out.println(dogs2.toString());

        Dog dog9 = dogs.get(1);
        dog9.setColour("purple");

        System.out.println(dogs2.toString());

    }
}
