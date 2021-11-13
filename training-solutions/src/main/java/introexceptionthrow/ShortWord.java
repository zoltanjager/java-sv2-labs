package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy max 5 betűs szót!");
        input = scanner.nextLine();

        if (input.length() > 5) {
            throw new IllegalArgumentException("Több mint 5 karaktert tartalmaz");
        }

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isLetter(input.charAt(i))){
                throw new IllegalArgumentException("Csak betűt adhatsz meg!");
            }
        }
        System.out.println(input);
    }
}
