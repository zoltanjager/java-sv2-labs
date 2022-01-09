package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public int findHowMany(Product product) {
        int counter = 0;
        for (Product actual : products ) {
            if( actual.equals(product)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop();

        webShop.products.add(new Product("kanál", "1234"));
        webShop.products.add(new Product("kiskanál", "1234"));
        webShop.products.add(new Product("villa", "12345"));

        System.out.println(webShop.findHowMany(new Product("nagykanál", "1234")));


    }
}
