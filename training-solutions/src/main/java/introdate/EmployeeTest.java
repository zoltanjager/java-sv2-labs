package introdate;

import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        String name;
        int year;
        int month;
        int day;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of employee: ");
        name = scanner.nextLine();
        System.out.println("Year of birth:");
        year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Month of birth:");
        month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Day of birth:");
        day = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(year, month, day, name);

        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());
    }
}
