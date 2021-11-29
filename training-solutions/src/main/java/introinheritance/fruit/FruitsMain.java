package introinheritance.fruit;

public class FruitsMain {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        Grape grape = new Grape();
        Apple apple = new Apple();
        GoldenDelicious goldenDelicious = new GoldenDelicious();
        Starking starking = new Starking();

        fruit.setName("Meggy");
        fruit.setWeight(5);
        System.out.println(fruit.getName());
        System.out.println(fruit.getWeight());

        grape.setName("Szőlő");
        grape.setType("Csemege");
        grape.setWeight(6);
        System.out.println(grape.getName());
        System.out.println(grape.getType());
        System.out.println(grape.getWeight());

        apple.setName("Alma");
        apple.setPieces(5);
        apple.setWeight(4);
        System.out.println(apple.getName());
        System.out.println(apple.getPieces());
        System.out.println(apple.getWeight());

        goldenDelicious.setName("Golden Delicious");
        goldenDelicious.setPieces(2);
        goldenDelicious.setWeight(3);
        System.out.println(goldenDelicious.getName());
        System.out.println(goldenDelicious.getPieces());
        System.out.println(goldenDelicious.getWeight());
        System.out.println(goldenDelicious.getColour());

        starking.setName("Starking");
        starking.setPieces(3);
        starking.setWeight(2);
        System.out.println(starking.getName());
        System.out.println(starking.getPieces());
        System.out.println(starking.getWeight());
        System.out.println(starking.getColour());

    }

}
