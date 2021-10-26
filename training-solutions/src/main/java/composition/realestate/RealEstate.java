package composition.realestate;

public class RealEstate {
    private String title;
    private double price;
    private Details details;

    public RealEstate(String title, double price, Details details) {
        this.title = title;
        this.price = price;
        this.details = details;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", details=" + details +
                '}';
    }
}
