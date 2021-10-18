package statements;

public class Investment {

    private double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment (int fund, int interestRate) {
        active = true;
        this.fund = fund;
        this.interestRate = interestRate;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return (fund * (double) days/365 * (double) interestRate/100);
    }

    public double close(int days) {
        double investmentResult = active == false ? 0 : (getYield(days) + fund)*(1-cost/100);
        active = false;
        return investmentResult;
    }
}
