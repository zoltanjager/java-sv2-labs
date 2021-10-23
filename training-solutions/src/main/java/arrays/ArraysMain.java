package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString(){
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size){
        int[][] a= new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(a);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day,anotherDay);
    }

    public boolean sameTempValuesDayLight(double[] day, double[] anotherDay){
        int min = min(day.length, anotherDay.length);

        double[] ArraysDay = Arrays.copyOfRange(day, 0, min);
        double[] ArraysAnotherDay = Arrays.copyOfRange(anotherDay, 0, min);
        return Arrays.equals(ArraysDay,ArraysAnotherDay);
    }

    private int min(int firstNumber, int SecondNumber){
        if (firstNumber<SecondNumber){
            return firstNumber;
        } else {
            return SecondNumber;
        }
    }

    public boolean wonLottery(int[] chosenNumbers, int[] winningNumbers){
        Arrays.sort(chosenNumbers);
        Arrays.sort(winningNumbers);

        return Arrays.equals(chosenNumbers,winningNumbers);
    }

    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());

        System.out.println(arraysMain.multiplicationTableAsString(4));

        System.out.println(arraysMain.sameTempValues(new double[]{12.2, 13.2, 14.2, 15.4, 18.5, 20},
                                                     new double[]{12.2, 13.4, 14.2, 15.4, 18.5, 20}));

        System.out.println(arraysMain.sameTempValuesDayLight(new double[]{12.2, 13.2, 14.2, 15.4, 18.5, 20},
                                                            new double[]{12.2, 13.2, 14.2, 15.4, 18.5}));

        System.out.println(arraysMain.wonLottery(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 6}));
    }

}
