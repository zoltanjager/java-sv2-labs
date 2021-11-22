package algorithmssum.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void testCreateTransaction() {
        Transaction transaction = new Transaction("123456-123456", TransactionOperation.CREDIT, 50_000);

        assertEquals("123456-123456", transaction.getAccountNumber());
        assertEquals(TransactionOperation.CREDIT, transaction.getTransactionOperation());
        assertEquals(50_000, transaction.getAmount());
        assertTrue(transaction.isCredit());
        assertFalse(transaction.isDebit());

    }
}
