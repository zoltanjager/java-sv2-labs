package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Your name:");
        String owner = scanner.nextLine();

        System.out.println("Your account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Your balance:");
        int balance = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);

        System.out.println("Your bank account is done: " + bankAccount.getInfo());

        bankAccount.deposit(5000);

        System.out.println("Monthly statement " + bankAccount.getInfo());

        bankAccount.withdraw(7500);

        System.out.println("Monthly statement " + bankAccount.getInfo());


    }
}
