package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        int inputNumber;

        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextInt();
        System.out.println("Your number " + ( inputNumber % 3 == 0 ? "can" : "can not" ) + " be divided by 3");
    }
}
