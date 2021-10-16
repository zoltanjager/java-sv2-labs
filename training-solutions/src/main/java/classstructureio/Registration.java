package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = scanner.nextLine();

        System.out.println("What is your email address?");
        String emailAddress = scanner.nextLine();

        System.out.println("Registration details");
        System.out.println("--------------------------------------");
        System.out.println("Your name: " + userName);
        System.out.println("Your email address: " + emailAddress);
    }
}
