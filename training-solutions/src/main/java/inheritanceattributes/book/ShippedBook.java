package inheritanceattributes.book;

public class ShippedBook extends Book {
    int shippingCost;

    public ShippedBook(String title, int price, int shippingCost) {
        super(title, price);
        this.shippingCost = shippingCost;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public int order(int pieces) {
        return  purchase(pieces) + getShippingCost();
    }

    @Override
    public String toString() {
        return getTitle() + ": " + getPrice() + "Ft, postaköltség: " + getShippingCost() + "Ft";
    }
}
