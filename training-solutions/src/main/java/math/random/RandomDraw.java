package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        int firstWinner;
        int secondWinner;

        List<String> names = new ArrayList<>();
        names.add("Gipsz Jakab");
        names.add("Gipsz Anna");
        names.add("Gipsz Mari");
        names.add("Gipsz Józsi");
        names.add("Gipsz Ati");
        names.add("Gipsz Zoli");
        names.add("Gipsz Ottó");
        names.add("Gipsz Klára");
        names.add("Gipsz Dóra");
        names.add("Gipsz Bori");

        Random random = new Random();
        firstWinner = random.nextInt(5);
        secondWinner = random.nextInt(5) + 5;

        System.out.println(names.get(firstWinner));
        System.out.println(names.get(secondWinner));


    }


}
