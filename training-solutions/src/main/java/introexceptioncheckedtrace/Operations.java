package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public static void main(String[] args) {
        Operations operations = new Operations();
        try {
            System.out.println(operations.getDailySchedule(operations.readFile()));
        }
        catch (IOException ioe) {
            System.out.println("Nincs ilyen file");
        }
    }

    public List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/underground.txt"));
    }

    public String getDailySchedule(List<String> subwayCars) {
        StringBuilder sb = new StringBuilder();
        LocalDate today = LocalDate.now();
        sb.append(today);
        sb.append(", ");
        for (String actual: subwayCars) {
            if (actual.charAt(0) == '2') {
                sb.append(actual);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
