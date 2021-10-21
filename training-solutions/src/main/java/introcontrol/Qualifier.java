package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        number= scanner.nextInt();
        scanner.nextLine();

        if (number <= 100) {
            System.out.println("Number is 100 or less than 100");
        } else {
            System.out.println("Number is greater than 100");
        }



    }
}
