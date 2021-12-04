package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class FirstVaccine implements Vaccine{

    private List<Person> vaccinationList = new ArrayList<>();


    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registrated) {
        addPregnantToList(registrated);
        addOlderThen65ToList(registrated);
        addOthersToList(registrated);
    }

    private void addPregnantToList(List<Person> registrated) {
        for (Person actual : registrated ) {
            if ( actual.getPregnant() == Pregnancy.YES) {
                vaccinationList.add(actual);
            }
        }
    }

    private void addOlderThen65ToList(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getPregnant() == Pregnancy.NO && actual.getAge() > 65) {
                vaccinationList.add(actual);
            }
        }
    }

    private void addOthersToList(List<Person> registrated) {
        for (Person actual : registrated) {
            if (actual.getPregnant() == Pregnancy.NO && actual.getAge() <= 65) {
                vaccinationList.add(actual);
            }
        }
    }

}
