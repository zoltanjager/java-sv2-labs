package introexceptiontrycatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {


        int firstNumber = 0;
        int secondNumber = 0;
        String operator;
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.println("Adj meg egy számot:");
            firstNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Adj meg egy másik számot:");
            secondNumber = scanner.nextInt();
            scanner.nextLine();


        } catch (InputMismatchException ime) {
            System.out.println("Nem egész számot adtál meg!");
            System.out.println(ime.getMessage());
        }


        System.out.println("Milyen műveletet hajtsak végre? + - * /");
        operator = scanner.nextLine();

        switch (operator) {
            case "+":
                System.out.println(calculator.sum(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(calculator.subtraction(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(calculator.multiplication(firstNumber, secondNumber));
                break;
            case "/":
                try {
                    System.out.println(calculator.division(firstNumber, secondNumber));
                } catch (ArithmeticException ae) {
                    System.out.println("Nullával való osztás!");
                    System.out.println(ae.getMessage());
                }
                break;
            default:
                System.out.println("Érvénytelen művelet!!");
        }

    }
}
