package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println(daysOfWeek[1]);

        int powerOfTwo[] = new int[5];

        for (int i = 0; i < powerOfTwo.length; i++) {
            if (i == 0){
                powerOfTwo[i] = 1;
            } else {
                powerOfTwo[i] = powerOfTwo[i-1]*2;
            }
        }

        for (int i = 0; i < powerOfTwo.length; i++) {
            System.out.print(powerOfTwo[i] + " ");
        }

        System.out.println();

        boolean anArray[] = new boolean[6];

        for (int i = 0; i < anArray.length; i++) {
            if (i == 0){
                anArray[0] = false;
            } else {
                anArray[i] = !anArray[i-1];
            }
        }

        for (boolean item: anArray
             ) {
            System.out.print(item + " ");
        }
    }
}
