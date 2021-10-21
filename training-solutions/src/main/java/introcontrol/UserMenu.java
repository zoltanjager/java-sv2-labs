package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználók felvétele");
        System.out.println("Többi: Kilépés");

        number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Felhasználók listázása");
        } if (number == 2) {
            System.out.println("Felhasználók felvétele");
        } else {

        }

    }
}
