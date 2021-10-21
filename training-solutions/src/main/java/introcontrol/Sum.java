package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        int sum=0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Give me a number");
            int number=scanner.nextInt();
            scanner.nextLine();
            sum+=number;
        }

        System.out.println("Sum: " +sum);
    }
}
