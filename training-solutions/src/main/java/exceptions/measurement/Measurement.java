package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {

    public List<String> readFromFile(Path path) {
        List<String> inputData;
        try {
            inputData = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return inputData;
    }

    public List<String> validate(List<String> input) {
        List<String> errorList = new ArrayList<>();

        for (String actual : input) {
            String[] temp = actual.split(",");
            if (temp.length != 3) {
                errorList.add(actual);
            } else {
                if (!isIntNumber(temp[0]) || !isDoubleNumber(temp[1]) || !isCorrectString(temp[2])) {
                    errorList.add(actual);
                }
            }
        }
        return errorList;
    }


    private boolean isIntNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isDoubleNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isCorrectString(String str) {
        if (str.contains(" ")) {
            return true;
        }
        return false;
    }


}
