package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number should not be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.maxSubtract = 100000;
    }

    public double subtract (double value) {
        if (value < 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        if (value > balance) {
            throw new LowBalanceBankOperationException("Low balance!");
        }
        if (value > maxSubtract) {
            throw new InvalidAmountBankOperationException("");
        }
        balance -= value;
        return balance;
    }

    public double deposit (double value) {
        if (value < 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }

        balance += value;
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract < 0  ) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.maxSubtract = maxSubtract;
    }
}
