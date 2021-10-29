package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        System.out.println("((3 * 2) + 4) / 2 - 3 = ?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextInt() == ((3 * 2) + 4) / 2 - 3) {
            System.out.println("Jó a megoldás!");
        } else {
            System.out.println("Hát ez nem sikerült!");
        }
    }
}
