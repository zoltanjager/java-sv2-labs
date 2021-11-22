package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {
    public int sumSalesAmount(List<Salesperson> salesperson) {
        int result = 0;
        for (Salesperson actual : salesperson) {
            result += actual.getAmount();
        }
        return result;
    }
}
