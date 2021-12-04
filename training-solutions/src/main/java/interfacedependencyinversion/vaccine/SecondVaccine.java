package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine{

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addYoungerThen65(registrated);
        addOlderThen65(registrated);
    }

    private void addYoungerThen65(List<Person> registrated) {
        for (Person actual : registrated ) {
            if ( actual.getPregnant() == Pregnancy.NO && actual.getChronic() == ChronicDisease.NO && actual.getAge() <= 65) {
                vaccinationList.add(actual);
            }
        }
    }

    private void addOlderThen65(List<Person> registrated) {
        for (Person actual : registrated ) {
            if ( actual.getPregnant() == Pregnancy.NO && actual.getChronic() == ChronicDisease.NO && actual.getAge() > 65) {
                vaccinationList.add(actual);
            }
        }
    }

}
