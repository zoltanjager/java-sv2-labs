package algorithmscount;

public class Digits {
    public int getCountOfNumbers() {
        int count = 0;
        for (int i = 10; i <= 99 ; i++) {
            int digit1 = i / 10;
            int digit2 = i % 10;
            if ( digit1 + 5 == digit2 || digit1 - 5 == digit2) {
                count++;
            }
        }
        return count;
    }
}
