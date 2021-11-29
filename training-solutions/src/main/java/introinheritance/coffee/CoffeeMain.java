package introinheritance.coffee;

public class CoffeeMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        coffee.setName("Latte");
        coffee.setPrice(600);

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();

        cappuccino.setName("Cappuccino");
        cappuccino.setPrice(500);

        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());


    }
}
