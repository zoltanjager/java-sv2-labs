package stringseparate;

import java.util.Arrays;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {
        String[] iceCream =  {"puncs", "csoki", "eper"};
        StringBuilder sb = new StringBuilder("Mai ajánlatuk: ");

        for (int i = 0; i < iceCream.length; i++) {
            sb.append(iceCream[i]);
            if (i != iceCream.length -1 ) {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());

    }
}
