package methodparam.sums;

public class Sums {

    private double sumPositives;
    private double sumNegatives;

    public Sums(double sumNegatives, double sumPositives) {
        this.sumPositives = sumPositives;
        this.sumNegatives = sumNegatives;
    }

    public double getSumPositives() {
        return sumPositives;
    }

    public double getSumNegatives() {
        return sumNegatives;
    }
}
