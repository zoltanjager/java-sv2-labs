package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionSumCalculatorTest {

    @Test

    void sumAmountOfCreditEntries(){
        TransactionSumCalculator calculator = new TransactionSumCalculator();

        List<Transaction> transactions = Arrays.asList(
                new Transaction("123456-123456", TransactionOperation.CREDIT, 100),
                new Transaction("123456-123456", TransactionOperation.DEBIT, 200),
                new Transaction("123456-123456", TransactionOperation.CREDIT, 5),
                new Transaction("123456-123457", TransactionOperation.CREDIT, 10),
                new Transaction("123456-123457", TransactionOperation.CREDIT, -100));

        assertEquals(15, calculator.sumAmountOfCreditEntries(transactions));
    }

}

