package sorting;

import java.util.Arrays;

public class Income {
    int[] incomes;

    public Income(int[] incomes) {
        this.incomes = incomes;
    }

    public int getHighestIncome(){
        Arrays.sort(incomes);
        int highest = incomes.length -1;
        return incomes[highest];
    }
}
