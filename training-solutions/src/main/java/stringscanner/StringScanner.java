package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {

        System.out.println("First sentence:");
        Scanner scanner = new Scanner(System.in);
        String firstSentence = scanner.nextLine();

        Scanner scannerWord = new Scanner(firstSentence);

        while (scannerWord.hasNext()) {
            System.out.println((scannerWord.next()));
        }

        System.out.println("Second sentence:");

        Scanner scanner1 = new Scanner(System.in);
        String secondSentence = scanner1.nextLine();

        Scanner scannerDelimiter = new Scanner(secondSentence).useDelimiter(", ");
            while (scannerDelimiter.hasNext()) {
                System.out.println((scannerDelimiter.next()));
            }
        }
    }

