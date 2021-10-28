package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {

        Exam exam = new Exam();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name:");
        String name = scanner.nextLine();

        System.out.println("Your birthdate (YYYY-MM-DD): ");
        String birthdate = scanner.nextLine();

        System.out.println("Your zipcode: ");
        String zipcode = scanner.nextLine();

        System.out.println("Your average: ");
        String average = scanner.nextLine();

        Person person = new Person(name, LocalDate.parse(birthdate),
                Integer.parseInt(zipcode), Double.parseDouble(average));

        exam.addPerson(person);

        System.out.println(exam.getPerson().toString());




    }
}
