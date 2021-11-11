package introexceptiontrace.aquarium;

public class AquariumMain {

    public static void main(String[] args) {
    Aquarium aquarium = new Aquarium();

    //Fish fish =
    aquarium.addFish(new Fish("harcsa","grey"));
    aquarium.addFish(new Fish("ponty","grey"));
    aquarium.addFish(new Fish("csuka","grey"));

        System.out.println(aquarium.getNumberOfFish());
    }
}
