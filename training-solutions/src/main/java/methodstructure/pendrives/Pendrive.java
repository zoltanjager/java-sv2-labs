package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public void risePrice(int percent) {
        price = price + (price * percent/100);
    }

    public int comparePricePerCapacity(Pendrive other) {
        double thisPendrive = getPricePerCapacity();
        double otherPendrive = other.getPricePerCapacity();

        if (thisPendrive > otherPendrive) {
            return 1;
        }
        if (thisPendrive < otherPendrive) {
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThen(Pendrive other) {
        return this.getPrice() < other.getPrice();
    }

    private double getPricePerCapacity() {
        return (double) price / capacity;
    }


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
