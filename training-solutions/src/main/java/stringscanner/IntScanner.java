package stringscanner;

import java.util.Scanner;

public class IntScanner {

    public static String convertInts(String ints) {

        Scanner scanner = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextInt()){
            int scannerNumber = scanner.nextInt();
            if ( scannerNumber> 100) {
                if (sb.isEmpty()) {
                    sb.append(scannerNumber);
                } else {
                    sb.append(", ");
                    sb.append(scannerNumber);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertInts("5;3;107;12;123;18;198"));
        System.out.println(convertInts("145"));
        System.out.println(convertInts("3"));
        System.out.println(convertInts(""));

    }

}
