package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Registration registration = new Registration();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Your last name:");
        String lastName = scanner.nextLine();

        String fullName = registration.getFullName(firstName, lastName);

        System.out.println("Year of birth:");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Month:");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Day:");
        int day = scanner.nextInt();
        scanner.nextLine();

        LocalDate dateOfBirth = registration.getDatesOfBirth(year, month, day);

        System.out.println("Email address");
        String email = scanner.nextLine();

        Person person = new Person(fullName, dateOfBirth, email);

        System.out.println(person.toString());


    }

    public String getFullName (String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public LocalDate getDatesOfBirth(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }


}
