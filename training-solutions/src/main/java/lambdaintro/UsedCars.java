package lambdaintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UsedCars {
    private List<Car> usedCars = new ArrayList<>();

    public UsedCars(List<Car> usedCars) {
        this.usedCars = usedCars;
    }

    public List<Car> listCarsByPrice() {
        List<Car> result = new ArrayList<>(usedCars);

        result.sort((car1, car2) ->
                Integer.valueOf(car1.getPrice()).compareTo(car2.getPrice()));
        return result;
    }

    public List<Car> listCarsByLengthDesc() {
        List<Car> result = new ArrayList<>(usedCars);

        result.sort((car1, car2) ->
                Double.valueOf(car1.getLength()).compareTo(car2.getLength()));

        Collections.reverse(result);
        return result;
    }


    public List<Car> listCarsOneBrandByType(String brand) {
        List<Car> result = new ArrayList<>();

        for (Car actual : usedCars) {
            if (actual.getBrand().equals(brand)) {
                result.add(actual);
            }
        }
        result.sort((car1, car2) ->
                car1.getType().compareTo(car2.getType()));
        return result;
    }
}
