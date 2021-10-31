package stringseparate;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes {
    public static String getCodesStartWithLetter(List<String> codes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codes.size(); i++) {

            if (Character.isAlphabetic(codes.get(i).charAt(0))) {
                if (sb.isEmpty()) {
                    sb.append(codes.get(i));
                } else {
                    sb.append(", ");
                    sb.append(codes.get(i));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> codes = new ArrayList(Arrays.asList("Rddffd", "1wwe", "efdff", "3dfdf"));

        System.out.println(getCodesStartWithLetter(codes));



    }
}
