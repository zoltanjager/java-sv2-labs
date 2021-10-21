package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        int numberOfPerson = 0;
        int remainingPlace = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of person:");
        numberOfPerson = scanner.nextInt();
        scanner.nextLine();

        if (numberOfPerson > 3) {
            System.out.println("Boat 5 rented out");
            remainingPlace-=5;
            numberOfPerson-=5;
        }

        if (numberOfPerson > 2) {
            System.out.println("Boat 3 rented out");
            remainingPlace-=3;
            numberOfPerson-=3;
        }

        if (numberOfPerson > 0) {
            System.out.println("Boat 2 rented out");
            remainingPlace-=2;
            numberOfPerson-=2;
        }

        if (numberOfPerson > 0) {
            System.out.println("No more boat!");
        } else {
            System.out.println("Number of remaining places: " + remainingPlace);
        }

    }
}
