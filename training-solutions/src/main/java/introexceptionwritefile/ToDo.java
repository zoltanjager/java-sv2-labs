package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        List<String> todo = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input = null;
        boolean quit = true;

        while (quit) {
            System.out.println("Add meg a következő teendőt:");
            input = scanner.nextLine();
            if (!"x".equals(input)) {
                todo.add(input);
            } else {
                quit = false;
            }
        }

        try {
            Files.write(Paths.get("todos.txt"), todo);
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
