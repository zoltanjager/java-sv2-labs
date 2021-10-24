package finalmodifier;

public class TaxCalculator {
    public static final double TAX_VALUE = 0.27;

    public static double tax(double price){
        return price*TAX_VALUE;
    }

    public static double priceWithTax (double price){
        return price + tax(price);
    }

    public static void main(String[] args) {
        System.out.println(tax(10));
        System.out.println(priceWithTax(10));
    }
}

