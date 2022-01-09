package collectionsequalshash;

import java.util.Objects;

public class Company {
    private String name;
    private String taxNumber;

    public Company(String name, String taxNumber) {
        this.name = name;
        this.taxNumber = taxNumber;
    }

    public String getName() {
        return name;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return taxNumber == company.taxNumber && name.equals(company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, taxNumber);
    }
}
