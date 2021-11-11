package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        String name;
        String movie;
        int tickets;
        int inputRow;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja mega a nevét:");
        name = scanner.nextLine();
        System.out.println("Adja meg a film címét:");
        movie = scanner.nextLine();
        System.out.println("Hány jegyet szeretne?");
        tickets = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Melyik sorba?");
        inputRow = scanner.nextInt();
        scanner.nextLine();

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: ");
        System.out.println("Vásárló neve: " + name);
        System.out.println("Film címe: " + movie);
        System.out.printf("Lefoglalt helyek: ");

        for (int i = 1; i <= tickets ; i++) {
            System.out.printf("%d. sor %d. szék", inputRow, i );
            if (i < tickets) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Jó szórakozást!");


    }
}
