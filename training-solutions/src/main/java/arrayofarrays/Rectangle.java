package arrayofarrays;

public class Rectangle {
    public void rectangularMatrix(int size){
        int[][]a = new int[size][size];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=i;
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.rectangularMatrix(5);
    }
}
