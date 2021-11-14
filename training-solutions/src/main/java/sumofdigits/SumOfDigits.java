package sumofdigits;

public class SumOfDigits {

    public int getSumOfDigits(int number) {
        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }
}
