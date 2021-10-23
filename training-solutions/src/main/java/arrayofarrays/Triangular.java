package arrayofarrays;

public class Triangular {

    public void  triangularMatrix (int size){
        int [][] a = new int[size][];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[i+1];
            for (int j = 0; j < i+1 ; j++) {
                a[i][j]=i;
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        triangular.triangularMatrix(10);
        }
    }

