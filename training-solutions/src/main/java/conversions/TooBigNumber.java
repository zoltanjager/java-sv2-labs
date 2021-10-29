package conversions;

public class TooBigNumber {

    public static long getRightResult(int number) {
        long result = 2_147_483_647;
        result += number;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getRightResult(10));
    }
}
