package collectionslist;

import java.time.LocalDate;

public class Food {
    private String name;
    private LocalDate expireDate;

    public Food(String name, LocalDate expireDate) {
        this.name = name;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

}
