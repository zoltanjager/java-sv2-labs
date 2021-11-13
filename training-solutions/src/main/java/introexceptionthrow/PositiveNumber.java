package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Adj meg egy pozitív számot!");

        try {
            number = Integer.parseInt(scanner.nextLine());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem számot adtál meg!");
        }

        if (number < 0) {
            throw new IllegalArgumentException("A szám nem pozitív!");
        }
        System.out.println(number);
    }
}
