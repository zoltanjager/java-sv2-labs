package immutable;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfProduction;

    public Car(String brand, String type, int yearOfProduction) {

        if (brand == null || brand.isBlank()){
            throw new IllegalArgumentException("Brand name cannot be empty!");
        }

        if (yearOfProduction > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of production cannot be in the future!");
        }

        this.brand = brand;
        this.type = type;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
