package algorithmscount.transaction;

public class Transaction {
    private String accountNumber;
    private TransactionType transactionType;
    private int amount;

    public Transaction(String accountNumber, TransactionType transactionType, int amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public boolean isCredit (){
        return transactionType == transactionType.CREDIT;
    }

    public boolean isDebit (){
        return transactionType == transactionType.DEBIT;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public int getAmount() {
        return amount;
    }
}
