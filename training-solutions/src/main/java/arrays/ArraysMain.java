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

    public static void main(String[] args) {

        ArraysMain arraysMain = new ArraysMain();
        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.multiplicationTableAsString(4));

    }

}
