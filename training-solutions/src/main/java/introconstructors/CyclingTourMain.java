package introconstructors;

import java.time.LocalDate;

public class CyclingTourMain {

    public static void main(String[] args) {
        CyclingTour cyclingTour = new CyclingTour("Tour de Pelso",
                LocalDate.of(2021, 9, 21));

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getKms());
        System.out.println(cyclingTour.getStartTime());
        System.out.println(cyclingTour.getNumberOfPeople());


        cyclingTour.registerPerson(5);
        cyclingTour.ride(45);

        System.out.println(cyclingTour.getDescription());
        System.out.println(cyclingTour.getNumberOfPeople());
        System.out.println(cyclingTour.getKms());



    }
}
