package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach

    void initBankAccount () {
        bankAccount = new BankAccount("John Doe", "123456-123456", 5000);
    }

    @Test
    void createBankAccount() {
        assertEquals("John Doe", bankAccount.getNameOfOwner());
        assertEquals("123456-123456", bankAccount.getAccountNumber());
        assertEquals(5000, bankAccount.getBalance());
    }


    @Test
    void testWithdraw() {
        bankAccount.withdraw(1000);
        assertEquals(4000,bankAccount.getBalance());
    }

    @Test
    void deposit() {
        bankAccount.deposit(1000);
        assertEquals(6000,bankAccount.getBalance());
    }
}