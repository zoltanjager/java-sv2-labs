package lambdaintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RealEstateAgency {

    private List<Flat> flats = new ArrayList<>();

    public RealEstateAgency(List<Flat> flats) {
        this.flats = flats;
    }

    public Flat findFirstCheaperFlat(int minPrice) {

        return findFirst(flat -> flat.getPrice() < minPrice);
    }

    private Flat findFirst(Predicate<Flat> condition) {
        for (Flat actual : flats) {
            if (condition.test(actual)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("No such flat.");
    }

    public Flat findFirstGreaterFlat(double maxArea) {
        return findFirst(flat -> flat.getArea() > maxArea);
    }

    public Flat findFirstFlatInSameTown(String town) {
        return findFirst(flat -> flat.getAddress().startsWith(town));
    }

}
