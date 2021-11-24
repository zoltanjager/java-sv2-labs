package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson SalesPersonWithMaxSalesAmount = null;
        for (Salesperson actual : sales ) {
            if ( SalesPersonWithMaxSalesAmount == null || actual.getAmount() > SalesPersonWithMaxSalesAmount.getAmount()) {
                SalesPersonWithMaxSalesAmount = actual;
            }
        }
        return SalesPersonWithMaxSalesAmount;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson SalesPersonWithFurthestAboveTarget = null;
        for (Salesperson actual : sales) {
            if (SalesPersonWithFurthestAboveTarget == null ||
                actual.getSalesDifferent() > SalesPersonWithFurthestAboveTarget.getSalesDifferent()) {
                SalesPersonWithFurthestAboveTarget = actual;
            }
        }
        return SalesPersonWithFurthestAboveTarget;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson SalesPersonWithFurthestBelowTarget = null;
        for (Salesperson actual : sales ) {
            if (SalesPersonWithFurthestBelowTarget == null ||
                actual.getSalesDifferent() < SalesPersonWithFurthestBelowTarget.getSalesDifferent()) {
                SalesPersonWithFurthestBelowTarget = actual;
            }
        }
        return SalesPersonWithFurthestBelowTarget;
    }
}
