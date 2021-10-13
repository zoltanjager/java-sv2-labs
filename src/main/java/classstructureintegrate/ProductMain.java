package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Item: ");
        String name = scanner.nextLine();
        System.out.println("Price: ");
        int price = scanner.nextInt();

        Product product = new Product(name, price);

        System.out.println(product.getName() + " - " + product.getPrice());

        product.increasePrice(3);

        System.out.println(product.getName() + " - " + product.getPrice());

        product.decreasePrice(2);

        System.out.println(product.getName() + " - " + product.getPrice());
    }
}
