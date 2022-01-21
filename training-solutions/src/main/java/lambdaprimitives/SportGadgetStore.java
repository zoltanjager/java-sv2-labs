package lambdaprimitives;

import java.util.IntSummaryStatistics;
import java.util.List;

public class SportGadgetStore {
    private List<Product> products;

    public SportGadgetStore(List<Product> products) {
        this.products = products;
    }

    public int getNumberOfProducts() {
        return products.stream()
                .mapToInt(Product::getPieces)
                .sum();
    }

    public double getAveragePrice() {
        if (products.isEmpty()) {
            return 0;
        } else {
            return products.stream()
                    .mapToDouble(Product::getPrice)
                    .summaryStatistics().getAverage();
        }
    }

    public String getExpensiveProductStatistics(double minPrice) {
        IntSummaryStatistics stats = products.stream()
                .filter(product -> product.getPrice() > minPrice)
                .mapToInt(Product::getPieces)
                .summaryStatistics();

        if (stats.getCount() == 0) {
            return "Nincs ilyen termék.";
        } else {
            return "Összesen " + stats.getCount() + " féle termék, amelyekből minimum "
                    + stats.getMin() + " db, maximum " + stats.getMax()
                    + " db, összesen " + stats.getSum() + " db van.";
        }
    }
}
