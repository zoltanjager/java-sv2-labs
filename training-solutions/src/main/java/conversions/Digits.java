package conversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Digits {
    List<Integer> digits = new ArrayList<>();

    public List<Integer> getDigits() {
        return digits;
    }

    public void addDigitsToList(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                digits.add(Integer.parseInt(Character.toString(text.charAt(i))));
            }
        }
    }

    public static void main(String[] args) {
        Digits digits = new Digits();

        digits.addDigitsToList("12Fgsds34");
        System.out.println(digits.getDigits());

    }
}
