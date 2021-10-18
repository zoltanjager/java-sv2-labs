package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(2.5,true);

        int distanceInt = (int) distance.getDistanceInKm();
        System.out.println(distanceInt);

    }
}
