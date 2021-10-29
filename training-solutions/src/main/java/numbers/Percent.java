package numbers;

public class Percent {
    public static double getValue(int x, int y) {
        return (double) x * ( y * 0.01 );
    }

    public static double getBase(int x, int y) {
        return (double) x / ( y * 0.01);
    }

    public static double getPercent(int x, int y) {
        return  ( y / (double) x ) * 100;
    }

    public static void main(String[] args) {

        System.out.println(getValue(200,30));
        System.out.println(getBase(60, 30));
        System.out.println(getPercent(10, 5));

    }

}
