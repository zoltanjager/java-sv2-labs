package stringbasic.characters;

import java.util.Arrays;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word:");
        String word = scanner.nextLine();
        System.out.println("Spell it please");
        char[] inputChars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            inputChars[i] = scanner.nextLine().toCharArray()[0];
        }
        String inputWord = new String(inputChars);

        if (word.equals(inputWord)) {
            System.out.println("Same word!");
        } else {
            System.out.println("Different word!");
        }

    }
}
