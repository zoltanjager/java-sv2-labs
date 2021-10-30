package stringbasic;

public class Person {
    private String name;
    private String emailAddress;
    private String SSN;
    private String bankAccount;
    private String phoneNumber;

    public Person(String name, String emailAddress, String SSN, String bankAccount, String phoneNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.SSN = SSN;
        this.bankAccount = bankAccount;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", SSN='" + SSN + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
