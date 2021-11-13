package introexceptionthrow;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String name;
        String age;
        Boolean valid = true;
        Validation validation = new Validation();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üdvözlöm!");
        System.out.println("Adja meg a nevét:");
        name = scanner.nextLine();
        try {
            validation.validateName(name);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            valid = false;
        }

        System.out.println("Adja meg az életkorát:");
        age = scanner.nextLine();

        try {
            validation.validateAge(age);
        }
        catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            valid = false;
        }

        System.out.println("A megadott regisztrációs adatok:");
        System.out.println("Az ön neve: " + name);
        System.out.println("Az ön életkora:" + age);

        if (valid) {
            System.out.println("Sikeres regisztráció!");
        } else {
            System.out.println("Sikertelen regisztráció!");
        }
    }

}
