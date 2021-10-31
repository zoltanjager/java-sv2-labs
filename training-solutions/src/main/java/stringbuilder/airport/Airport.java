package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder deletedFlights = new StringBuilder("Deleted flights:\n");
        for (int i = 0; i < flights.size(); i++) {
            if ( flights.get(i).getStatus() == Status.DELETED ) {
                deletedFlights.append(flights.get(i).getFlightNumber());
                deletedFlights.append("\n");
            }
        }
        return deletedFlights.toString();
    }

}
