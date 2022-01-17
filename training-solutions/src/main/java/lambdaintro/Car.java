package lambdaintro;

public class Car {
    private String brand;
    private String type;
    private int price;
    private Double length;

    public Car(String brand, String type, int price, Double length) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.length = length;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public Double getLength() {
        return length;
    }
}
