package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Alma", "Körte", "Szilva", "", "Eper");

        try {
            for (String actual: words) {
                System.out.println(actual.charAt(0));
            }
        }
        catch (StringIndexOutOfBoundsException sioe) {
            System.out.println("A lista egyik eleme nem tartalmaz karaktert");
            System.out.println(sioe.getMessage());
        }

    }
}
