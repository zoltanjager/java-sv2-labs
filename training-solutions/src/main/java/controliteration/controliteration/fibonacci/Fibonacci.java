package controliteration.controliteration.fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy számot:");
        int number = scanner.nextInt();
        int[] fibonacci = new int[number+2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

    //    for (int i = 2; i < fibonacci.length; i++) {
    //        fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
    //    }

        int j = 2;
        do {
            fibonacci[j] = fibonacci[j-1] + fibonacci[j-2];
            j++;
        } while (j<fibonacci.length);

        for (int item: fibonacci
             ) {
            System.out.print(item + ", ");
        }
    }
}
