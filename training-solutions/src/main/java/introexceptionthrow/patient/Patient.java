package introexceptionthrow.patient;

import javax.swing.*;
import java.util.Arrays;

public class Patient {
    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String socialSecurityNumber, int yearOfBirth) {
        if (name.isBlank() || name == null ) {
            throw new IllegalArgumentException("Üres nevet adtál meg!");
        }

        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("Érvénytelen születési év!");
        }

        if (!new SsnValidator().isValidSsn(socialSecurityNumber)){
            throw new IllegalArgumentException("Érvénytelen TAJ szám!");
        }
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.yearOfBirth = yearOfBirth;
    }


    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient firstPatient = new Patient("Jane Doe", "aaaaaaaaa", 1980);
        System.out.println(firstPatient.getName());
        System.out.println(firstPatient.getSocialSecurityNumber());
        System.out.println(firstPatient.getYearOfBirth());

        Patient secondPatient = new Patient("Jack Doe", "034331134", 1985);
        System.out.println(secondPatient.getName());
        System.out.println(secondPatient.getSocialSecurityNumber());
        System.out.println(secondPatient.getYearOfBirth());
//034331134),
        //Patient thirdPatient = new Patient ("Jane Doe", "987654321", 1855);
        //System.out.println(thirdPatient.getName());
        //System.out.println(thirdPatient.getSocialSecurityNumber());
        //System.out.println(thirdPatient.getYearOfBirth());
    }
}
