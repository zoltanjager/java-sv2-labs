package literals;

import java.util.Locale;

public class LiteralsMain {
    public static void main(String[] args) {

        System.out.println(Integer.toString(1) + Integer.toString(2));
        System.out.println(1 + "" + 2);

        double quotient = 3 / 4d;
        System.out.println(quotient);

        long big = 3_244_444_444L;

        System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));

    }
}
