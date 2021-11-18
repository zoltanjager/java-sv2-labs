package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {

        List<String> birthDays = new ArrayList<>();
        int numberOfRecords;
        StringBuilder sb = new StringBuilder();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg hány ember születésnapját szeretnéd rögzíteni:");
        numberOfRecords = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numberOfRecords ; i++) {
            System.out.printf("%d. ismerős neve:" , i);
            sb.append(scanner.nextLine());
            sb.append(", ");
            System.out.println("Születési ideje: (YYYY-MM-DD)");
            sb.append(scanner.nextLine());
            sb.append("\n");
        }
        birthDays.add(sb.toString());

        try {
            Files.write(Paths.get("Birthdays.txt"), birthDays);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
