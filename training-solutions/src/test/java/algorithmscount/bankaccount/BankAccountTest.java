package algorithmscount.bankaccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testCreateBankAccount() {
        BankAccount bankAccount = new BankAccount("John Doe", "123456-123456", 15000);

        assertEquals("John Doe", bankAccount.getNameOfOwner());
        assertEquals("123456-123456", bankAccount.getAccountNumber());
        assertEquals(15000, bankAccount.getBalance());

    }

}