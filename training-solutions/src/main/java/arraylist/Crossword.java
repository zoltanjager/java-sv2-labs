package arraylist;

import java.util.Arrays;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {

        List<String> listOfWords = Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ",
                                                 "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ",
                                                 "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");

        System.out.println(listOfWords.size());

        for (String i: listOfWords
             ) {
            if(i.length()==6){
                System.out.println(i);
            }
        }
    }
}
