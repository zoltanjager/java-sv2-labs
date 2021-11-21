package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        Names name = new Names();

        try {
            List<String> names = Files.readAllLines(Paths.get("src/main/resources/names_withoutdr.txt"));
            //List<String> names = Files.readAllLines(Paths.get("src/main/resources/names.txt"));
            System.out.println(name.getNameWithDr("dr", names));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        finally {
            System.out.println("End of read");
        }
    }

    private String getNameWithDr(String prefix, List<String> names){
        for (String name : names) {
            if (name.startsWith(prefix)) {
                return name;
            }
        }
        return "";
    }
}
