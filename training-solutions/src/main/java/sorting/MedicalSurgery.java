package sorting;

import java.util.*;

public class MedicalSurgery {

    List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> orderedPatients = new ArrayList<>(patients);
        Collections.sort(orderedPatients, new PatientComparator());
        return orderedPatients;
    }
}
