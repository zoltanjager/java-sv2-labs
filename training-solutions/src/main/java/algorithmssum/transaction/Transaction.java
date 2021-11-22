package algorithmssum.transaction;

public class Transaction {
    private String accountNumber;
    private TransactionOperation TransactionOperation;
    private int amount;

    public Transaction(String accountNumber, algorithmssum.transaction.TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        TransactionOperation = transactionOperation;
        this.amount = amount;
    }

    public boolean isCredit() {
        return TransactionOperation == TransactionOperation.CREDIT;
    }

    public boolean isDebit() {
        return TransactionOperation == TransactionOperation.DEBIT;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public algorithmssum.transaction.TransactionOperation getTransactionOperation() {
        return TransactionOperation;
    }

    public int getAmount() {
        return amount;
    }
}
