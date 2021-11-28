package methodparam.sums;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {
    public Sums sum(String floatingNumbers) {
        String[] temp = floatingNumbers.replace(',','.').split(";");

        double sumPositiveNumbers = 0.0;
        double sumNegativNumbers = 0.0;
        for (String actual: temp) {
            if (Float.parseFloat(actual) < 0 ) {
                sumNegativNumbers += Float.parseFloat(actual);
            } else {
                sumPositiveNumbers += Float.parseFloat(actual);
            }
        }
        return new Sums (sumNegativNumbers ,sumPositiveNumbers);
    }

    public String readFile() {
        try {
            List<String> floatingNumbers = Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt"));
            return floatingNumbers.get(0);
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("A fájl nem olvasható!", ioe.getCause());
        }
    }

}
