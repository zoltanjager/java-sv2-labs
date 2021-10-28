package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {

        for (Continent i: Continent.values()
             ) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(Continent.values()));

        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("INDIAN"));

        System.out.println(Football.GOALKEEPER.name());
        System.out.println(Football.STRIKER.name());


    }
}
