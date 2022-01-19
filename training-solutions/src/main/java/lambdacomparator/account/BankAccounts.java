package lambdacomparator.account;

import java.text.Collator;
import java.util.*;

public class BankAccounts {
    private List<BankAccount> accounts;

    public BankAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }


    List<BankAccount> listBankAccountsByAccountNumber() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort(Comparator.naturalOrder());
        return result;
    }


    List<BankAccount> listBankAccountsByBalance() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort(Comparator.comparingDouble(bankAccount -> Math.abs(bankAccount.getBalance())));
        return result;
    }


    List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort(Comparator.comparingDouble(BankAccount::getBalance).reversed());

        return result;
    }

    List<BankAccount> listBankAccountsByNameThenAccountNumber() {
        List<BankAccount> result = new ArrayList<>(accounts);
        result.sort(Comparator.comparing(BankAccount::getNameOfOwner,
                        Comparator.nullsFirst(Collator.getInstance(new Locale("hu", "HU"))))
                .thenComparing(BankAccount::getAccountNumber));
        return result;
    }


}
