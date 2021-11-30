package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("A épület", 350, 2);
        SchoolBuilding schoolBuilding = new SchoolBuilding("B épület", 200, 1, 4);

        System.out.println(building.getFloors());
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
