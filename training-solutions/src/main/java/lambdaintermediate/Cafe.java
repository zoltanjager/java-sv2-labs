package lambdaintermediate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cafe {

    private List<CoffeeOrder> orders;

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;

    }

    public List<CoffeeOrder> getOrders() {
        return orders;
    }

    public Integer getTotalIncome(){
        return orders.stream()
                .flatMap(coffeeOrder -> coffeeOrder.getCoffeeList().stream())
                .map(coffee -> coffee.getPrice())
                .reduce(0, (integer, integer2) -> integer + integer2, (integer, integer2) -> integer + integer2);
    }

    public Integer getTotalIncome(LocalDate date) {
        return orders.stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().toLocalDate().isEqual(date))
                .flatMap(coffeeOrder -> coffeeOrder.getCoffeeList().stream())
                .map(coffee -> coffee.getPrice())
                .reduce(0, (integer, integer2) -> integer + integer2, (integer, integer2) -> integer + integer2);
    }

    public long getNumberOfCoffee(CoffeeType type) {
        return orders.stream()
                .flatMap(coffeeOrder -> coffeeOrder.getCoffeeList().stream())
                .filter(coffee -> coffee.getType().equals(type))
                .count();
    }

    public List<CoffeeOrder> getOrdersAfter(LocalDateTime from){
        return orders.stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().isAfter(from))
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date){
        return orders.stream()
                .filter(coffeeOrder -> coffeeOrder.getDateTime().toLocalDate().isEqual(date))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .collect(Collectors.toList());
    }

}
