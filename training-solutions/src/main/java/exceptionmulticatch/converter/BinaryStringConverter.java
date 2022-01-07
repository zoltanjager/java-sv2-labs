package exceptionmulticatch.converter;

public class BinaryStringConverter {



    public boolean[] binaryStringToBooleanArray(String string) {

        if(string == null) {
            throw new NullPointerException("Binary string is null.");
        }

        boolean[] booleanArray = new boolean[string.length()];
        char[] arrayChar = string.toCharArray();

        for (int i =0 ; i < string.length() ; i++ ) {
            if ( arrayChar[i] == '1') {
                booleanArray[i] = true;
            } else if ( arrayChar[i] == '0') {
                booleanArray[i] = false;
            } else {
                throw new IllegalArgumentException("Binary string is not valid.");
            }
        }
        return booleanArray;
    }

    public String booleanArrayToBinaryString(boolean[] array) {
        if (array == null){
            throw new NullPointerException("Boolean array is null.");
        }

        if (array.length == 0) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }

        StringBuilder sb = new StringBuilder();
        for (boolean actual : array ) {
            if (actual == true) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb.toString();
    }
}
