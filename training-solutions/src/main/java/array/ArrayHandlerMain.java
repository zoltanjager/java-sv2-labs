package array;

public class ArrayHandlerMain {
    public static void main(String[] args) {
        int[] anArrayOfNumbers = {2, 3, 4, 5,};
        String[] anArrayOfStrings = {"Apple", "Plum", "Grapes"};

        ArrayHandler arrayHandler = new ArrayHandler();

        arrayHandler.addIndexToNumber(anArrayOfNumbers);

        for (int item: anArrayOfNumbers
             ) {
            System.out.println(item);
        }

        for (int item: anArrayOfNumbers
        ) {
            System.out.print(item + ", ");
        }

        System.out.println();

        arrayHandler.concatenateIndexToWord(anArrayOfStrings);

        for (String item: anArrayOfStrings
            ) {
            System.out.println(item);
        }

        for (String item: anArrayOfStrings
            ) {
            System.out.print(item + ", ");
        }
    }


}
