package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("John Doe", 5000);
        PriorityPassenger priorityPassenger= new PriorityPassenger("Jack Doe", 5000, 30);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Jane Doe", 5000, 50);

        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());

        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());

        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());

    }
}
