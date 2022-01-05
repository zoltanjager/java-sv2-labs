package exceptionclass.bank;

public class InvalidAccountNumberBankOperationException extends InvalidBankOperationException{
    public InvalidAccountNumberBankOperationException() {
    }

    public InvalidAccountNumberBankOperationException(String message) {
        super(message);
    }
}
