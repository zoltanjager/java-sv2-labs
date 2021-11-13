package introexceptionthrow;

public class Validation {
    void validateName(String name) {
        if (name.isBlank() || name.equals(null)) {
            throw new IllegalArgumentException("Üres nevet adtál meg!");
        }
    }

    void validateAge (String ageString) {
        int age = 0;

        if (ageString.isBlank() || ageString.equals(null)) {
            throw new IllegalArgumentException("Üres életkort adtál meg!");
        }

        try {
            age = Integer.parseInt(ageString);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nem számot adtál meg");
        }

        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Érvénytelen az életkor!");
        }

    }
}
