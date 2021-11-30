package dynamictypes.publictransport;

import java.util.ArrayList;
import java.util.List;

public class PublicTransport {

    private List<PublicVehicle> publicVehicleList = new ArrayList<>();

    public void addVehicle(PublicVehicle vehicle) {
        publicVehicleList.add(vehicle);
    }

    public List<PublicVehicle> getPublicVehicleList() {
        return publicVehicleList;
    }
}
