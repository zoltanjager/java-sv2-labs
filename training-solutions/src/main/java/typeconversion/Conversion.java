package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double number) {
        int returnNumber = (int) number;
        return (double) returnNumber;
    }

    public byte[] convertIntArrayToByteArray(int[] intArray) {
        byte [] byteArray = new byte[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            if ( intArray[i] > 0 && intArray[i] < 127 ) {
                byteArray[i] = (byte) intArray[i];
            } else {
                byteArray[i] = -1;
            }
        }
        return byteArray;
    }

    public int getFirstDecimal(double number) {
        int numberInt = (int) number;
        double difference = number - numberInt;
        int result = (int) (difference * 10);
        return result;
    }

}
