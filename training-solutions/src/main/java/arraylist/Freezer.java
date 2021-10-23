package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> freezerList = new ArrayList<>();

        freezerList.add("pork");
        freezerList.add("apple");
        freezerList.add("wine");
        freezerList.add("beef");
        freezerList.add("beer");

        System.out.println(freezerList.toString());
        System.out.println(freezerList.size());

        freezerList.remove(0);
        freezerList.remove(0);
        System.out.println(freezerList.toString());
        System.out.println(freezerList.size());


    }
}
