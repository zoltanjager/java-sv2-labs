package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            try {
                System.out.println("Adj meg egy számot!");
                number = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Nem számot adtál meg");
            }
            finally {
                System.out.println("Vége a körnek.");
            }
        } while (number % 2 != 0);


    }
}
