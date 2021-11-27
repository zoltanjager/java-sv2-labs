package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate dateOfRegistration;
    private final String registrationNumber;

    public Monument(String name, String address, LocalDate dateOfRegistration, String registrationNumber) {
        if (isEmpty(name) || isEmpty(address) || isEmpty(registrationNumber)) {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }

        this.name = name;
        this.address = address;
        this.dateOfRegistration = dateOfRegistration;
        this.registrationNumber = registrationNumber;
    }

    private boolean isEmpty(String test) {
        if (test == null || test.isBlank()){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
