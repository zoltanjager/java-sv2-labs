package statements;

import java.util.Scanner;

public class InvestmentMain {
    public static void main(String[] args) {

        int fund;
        int interestRate;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fund:");
        fund = scanner.nextInt();
        System.out.println("Interest rate:");
        interestRate = scanner.nextInt();

        Investment investment = new Investment(fund, interestRate);

        System.out.println("Investment: " + fund);
        System.out.println("Total return for 50 days: " + investment.getYield(50));
        System.out.println("Amount withdrawn after 80 days: " + investment.close(80));
        System.out.println("Amount withdrawn after 90 days: " + investment.close(90));

    }
}
