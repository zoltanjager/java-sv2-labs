package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> kms;
    private String name;

    public Run(String name) {
        this.name = name;
        this.kms = new ArrayList<>();
    }

    public void addRun(double km) {
        kms.add(km);
    }

    public String printFormattedRunText() {
        String today = LocalDate.now().toString();
        int days = kms.size();
        double km = kms.get(kms.size() - 1);
        return String.format("Kedves %s! A mai dátum: %s." +
                " Ezen a héten ez a(z) %d. futásod." +
                " Most %.1f km-t futottál. Csak így tovább!", name, today, days, km);
    }

}
