package chars;

public class LetterAndDigits {

    public static void printLetterOrDigit(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))) {
                System.out.println(text.charAt(i) + " : Alphabetic");
            } else if (Character.isDigit(text.charAt(i))) {
                System.out.println(text.charAt(i) + " : Digit");
            } else {
                System.out.println(text.charAt(i) + " : Other");
            }
        }
    }

    public static void main(String[] args) {
        printLetterOrDigit("bfa68fF;X");
    }
}
