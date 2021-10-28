package chars;

public class Whitespace {
    public static String makeWhitespaceToStar(String text) {
        char[] convertedText = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (Character.isWhitespace(text.charAt(i))) {
            convertedText[i] = '*';
            } else {
                convertedText[i] = text.charAt(i);
            }
        }
        return new String(convertedText);
    }

    public static void main(String[] args) {
        System.out.println(makeWhitespaceToStar("Valami   vmi"));
    }
}
