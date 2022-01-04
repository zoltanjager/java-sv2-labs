package exceptions.sum;

public class NumbersSum {
    public int getSum(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter is null");
        }
        int sum = 0;
        for (int actual : numbers) {
            sum += actual;
        }
        return sum;
    }


    public int getSum(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Parameter is null");
        }
        int sum = 0;
        try {

            for (String actual : numbers) {
                sum += Integer.parseInt(actual);
            }
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("It is not a number");
        }
        return sum;
    }
}
