package stringconcat.employee;

public class Employee {
    private String name;
    private String profession;
    private int salary;

    public Employee(String name, String profession, int salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  name + " - " + profession + " - " + salary + " Ft";
    }
}
