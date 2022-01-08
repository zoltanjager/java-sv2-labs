package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {


    public String getHiddenWord(Path path) {
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(path)) {

            while (scanner.hasNextLine()) {
                sb.append(findLetter(scanner.nextLine()));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return sb.toString();
    }

    private char findLetter(String input) {
        char result = ' ';
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isAlphabetic(c)) {
                result = c;
            }
        }
        return result;
    }
}
