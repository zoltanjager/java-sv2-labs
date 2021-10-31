package stringbuilder.airport;

public class AirportMain {
    public static void main(String[] args) {
        Airport airport = new Airport();

        airport.addFlight(new Flight("B123",Status.ACTIVE));
        airport.addFlight(new Flight("A123",Status.ACTIVE));
        airport.addFlight(new Flight("C123",Status.ACTIVE));
        airport.addFlight(new Flight("D123",Status.DELETED));
        airport.addFlight(new Flight("E123",Status.DELETED));

        System.out.println(airport.getDeletedFlights());


    }
}
