package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Bill {
    List<String> readBillItemsFromFile(Path path) {
        List<String> billItems;
        try {
            billItems = Files.readAllLines(path);
            System.out.println(billItems);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return billItems;
    }
}
