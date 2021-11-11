package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 0;
        String operator;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Adj meg egy számot:");
            firstNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Adj meg egy másik számot:");
            secondNumber = scanner.nextInt();
            scanner.nextLine();


        }
        catch (InputMismatchException ime) {
            System.out.println("Nem egész számot adtál meg!");
            System.out.println(ime.getMessage());
        }


        System.out.println("Milyen műveletet hajtsak végre? + - * /");
        operator = scanner.nextLine();

        switch (operator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                try {
                    System.out.println(firstNumber / secondNumber);
                }
                catch (ArithmeticException ae) {
                    System.out.println("Nullával való osztás!");
                    System.out.println(ae.getMessage());
                }
                break;
            default:
                System.out.println("Érvénytelen művelet!!");
        }

    }
}
