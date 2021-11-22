package algorithmscount.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test

    void createTransaction () {
        Transaction transaction = new Transaction("123456-123456", TransactionType.CREDIT, 15000);

        assertEquals("123456-123456", transaction.getAccountNumber());
        assertEquals(TransactionType.CREDIT, transaction.getTransactionType());
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());
        assertEquals(15000, transaction.getAmount());

    }
}