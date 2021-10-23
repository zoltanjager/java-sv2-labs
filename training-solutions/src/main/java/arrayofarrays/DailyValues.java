package arrayofarrays;

public class DailyValues {
    public void getValues(){
        int[][] a = new int[12][];
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < days.length; i++) {
            a[i] = new int[days[i]];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                a[i][j] = j;
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();
        dailyValues.getValues();
    }
}
