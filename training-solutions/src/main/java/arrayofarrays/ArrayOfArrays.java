package arrayofarrays;

public class ArrayOfArrays {
    public void printArrayOfArrays (int[][] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] a = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2} };
        System.out.println(a[0].length);

        ArrayOfArrays array = new ArrayOfArrays();
        array.printArrayOfArrays(a);
    }
}


