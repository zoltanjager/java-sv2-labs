package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your name: ");
        client.name = scanner.nextLine();

        System.out.println("Your address: ");
        client.address = scanner.nextLine();

        System.out.println("Your year of birth: ");
        client.year = scanner.nextInt();

        System.out.println("Your name: " + client.name);
        System.out.println("Your address: " + client.address);
        System.out.println("Your year of birth: " + client.year);

    }
}

