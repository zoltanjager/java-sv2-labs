package chars;

public class Words {
    public static String pushWord(String word) {

        char[] shiftedChars = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            shiftedChars[i] = (char) (word.charAt(i) + 1);

        }
        return new String(shiftedChars);
    }

    public static void main(String[] args) {
        System.out.println(pushWord("alma"));
    }
}
