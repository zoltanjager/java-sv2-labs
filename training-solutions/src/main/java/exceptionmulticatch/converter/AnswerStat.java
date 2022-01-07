package exceptionmulticatch.converter;

public class AnswerStat {

    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    boolean[] convert(String string) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(string);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new InvalidBinaryStringException(e);
        }
    }

    public int answerTruePercent(String string) {
        boolean[] array = binaryStringConverter.binaryStringToBooleanArray(string);
        int counter = 0;
        for (boolean actual : array) {
            if (actual == true) {
                counter++;
            }
        }
        return (int) Math.round((double) counter / array.length * 100);
    }
}
