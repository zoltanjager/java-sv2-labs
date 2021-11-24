package algorithmsdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    @Test
    void testContainsBalanceGreaterThan() {
        BankAccount bankAccount = new BankAccount("John Doe", "123456-123456", 5000);
        BankAccount bankAccount1 = new BankAccount("Jack Doe", "123456-123457", 10000);
        BankAccount bankAccount2 = new BankAccount("Bill Doe", "123456-123458", 20000);
        BankAccount bankAccount3 = new BankAccount("Jane Doe", "123456-123459", 30000);

        List<BankAccount> bankAccounts = Arrays.asList(bankAccount, bankAccount1, bankAccount2, bankAccount3);

        BankAccountDecisionMaker bankAccountDecisionMaker = new BankAccountDecisionMaker();

        assertTrue(bankAccountDecisionMaker.containsBalanceGreaterThan(bankAccounts, 15000));
        assertFalse(bankAccountDecisionMaker.containsBalanceGreaterThan(bankAccounts, 31000));
    }
}