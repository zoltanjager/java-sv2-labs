package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot:");
        int number = scanner.nextInt();
        scanner.nextLine();


        for (int i = number; i >= number; i++) {
            if (i % 7 == 0) {
                System.out.println("X");
                continue;
            }
            if (Integer.toString(i).contains("7")) {
                break;
            }
            System.out.println(i);
        }
    }


//        boolean reachNumber = true;
//        boolean dividedBySeven = false;
//        String convertedNumber;
//
//        while (reachNumber) {
//            if (number % 7 == 0 ) {
//                dividedBySeven = true;
//            } else {
//                dividedBySeven = false;
//            }
//
//            convertedNumber = number + "";
//
//            if (convertedNumber.contains("7") && !dividedBySeven ){
//                reachNumber = false;
//            } else if (dividedBySeven) {
//                System.out.println("X");
//            } else if (!dividedBySeven) {
//                System.out.println(number);
//            }
//            number++;
//        }
}



