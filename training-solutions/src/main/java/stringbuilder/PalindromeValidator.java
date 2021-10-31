package stringbuilder;

public class PalindromeValidator {
    public static boolean isPalindrome (String word) {
        StringBuilder sb = new StringBuilder(word);
        sb = sb.reverse();

        if (word.equalsIgnoreCase(sb.toString())) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("alma"));
        System.out.println(isPalindrome("anna"));

    }
}
