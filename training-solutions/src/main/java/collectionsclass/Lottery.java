package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
    List<Integer> balls = new ArrayList<>();


    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount) {
        if (ballCount <= lotteryType) {
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }

        for (int i = 1; i <= ballCount; i++) {
            balls.add(i);
        }

        Collections.shuffle(balls);
        List<Integer> winningNumbers = balls.subList(0, lotteryType);
        Collections.sort(winningNumbers);
        return winningNumbers;
    }
}
