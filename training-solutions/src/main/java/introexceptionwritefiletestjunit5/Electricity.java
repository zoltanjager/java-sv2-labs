package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    public void writeStreets(Path path) {
        List<String> streetList  = getStreetList();
        try {
            Files.write(path, streetList);
        } catch (    IOException ioe) {
            throw new IllegalStateException("Can not write file.", ioe);
        }
    }

    private List<String> getStreetList() {
        List<String> streetList = new ArrayList<>();
        streetList.add(LocalDate.now().toString());
        streetList.add("Fő utca");
        streetList.add("Bartók Béla utca");
        streetList.add("Rákóczi utca");
        return streetList;
    }
}
