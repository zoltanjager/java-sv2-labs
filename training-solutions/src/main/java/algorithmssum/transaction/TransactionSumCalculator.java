package algorithmssum.transaction;

import java.util.List;

public class TransactionSumCalculator {

    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int result = 0;
        for (Transaction actual : transactions) {
            if(actual.isCredit()) {
            result += actual.getAmount();
            }
        }
        return result;
    }
}
