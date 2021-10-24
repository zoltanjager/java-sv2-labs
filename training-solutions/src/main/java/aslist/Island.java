package aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("","","");
        String newImportantThing;
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Your first important thing");
        importantThings.set(0, scanner.nextLine());
        System.out.println("Your second important thing");
        importantThings.set(1, scanner.nextLine());
        System.out.println("Your third important thing");
        importantThings.set(2, scanner.nextLine());
        System.out.println(importantThings.toString());


        System.out.println("Which would you change?");
        number=scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your new important thing?");
        newImportantThing = scanner.nextLine();

        changeImportantThings(number, newImportantThing, importantThings);

        System.out.println(importantThings.toString());

    }
    public static void changeImportantThings(int number, String newImportantThing, List importantThings){
        importantThings.set(number-1, newImportantThing);
    }

}
