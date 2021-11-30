package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {

    @Test

    void addVehicle() {

        PublicVehicle bus = new Bus(120, 4.5, "Volvo");
        PublicVehicle tram = new Tram(49, 25, 4);
        PublicVehicle metro = new Metro(4, 45, 12);

        PublicTransport publicTransport = new PublicTransport();

        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicleList().size());
    }
}