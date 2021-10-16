package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me an integer!");
        int firstNumber = scanner.nextInt();

        System.out.println("Give me an another integer!");
        int secondNumber = scanner.nextInt();

        System.out.println("Your numbers: " + firstNumber + " + " + secondNumber);
        System.out.println("Result: " + (firstNumber + secondNumber));
    }
}
