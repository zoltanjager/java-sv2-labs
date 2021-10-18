package conventions;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car("Skoda", "Diesel", 5, 5);

        System.out.println("Car type: " + car.getCarType());
        System.out.println("Engine type: " + car.getEngineType());
        System.out.println("Number of doors: " + car.getDoors());
        System.out.println("Max person: " + car.getPersons());

        car.setCarType("Ford");
        car.setEngineType("Petrol");
        car.setDoors(4);
        car.setPersons(4);
        car.addModelName("Mondeo");

        System.out.println("Car type: " + car.getCarType());
        System.out.println("Engine type: " + car.getEngineType());
        System.out.println("Number of doors: " + car.getDoors());
        System.out.println("Max person: " + car.getPersons());


    }
}
