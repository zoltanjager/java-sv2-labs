package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        String username;
        String password1;
        String password2;
        String email;

        UserValidator userValidator = new UserValidator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your username: ");
        username = scanner.nextLine();
        System.out.println("Give me your password: ");
        password1 = scanner.nextLine();
        System.out.println("Give me your password again:");
        password2 = scanner.nextLine();
        System.out.println("Give me your email address:");
        email = scanner.nextLine();

        System.out.println(userValidator.isValidUsername(username) ? "Your name is correct" : "Sorry your nam is invalid");
        System.out.println(userValidator.isValidPassword(password1,password2) ? "Your password is OK" : "Your password is invalid");
        System.out.println(userValidator.isValidEmail(email) ? "Your email address is valid" : "Your email address is invalid");





    }
}
