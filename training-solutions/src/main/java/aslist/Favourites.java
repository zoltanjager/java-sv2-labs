package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {

    public static void main(String[] args) {
        List<String> favoriteThings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your favorite book:");
        favoriteThings.add(scanner.nextLine());
        System.out.println("Your favorite car:");
        favoriteThings.add(scanner.nextLine());
        System.out.println("Your favorite movie:");
        favoriteThings.add(scanner.nextLine());

        System.out.println(favoriteThings.toString());
        System.out.println(favoriteThings.size());

    }


}
