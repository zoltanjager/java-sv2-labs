package primitivetypes.exam;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDate;
    private int zipcode;
    private double average;

    public Person(String name, LocalDate birthDate, int zipcode, double average) {
        this.name = name;
        this.birthDate = birthDate;
        this.zipcode = zipcode;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", zipcode=" + zipcode +
                ", average=" + average +
                '}';
    }
}
