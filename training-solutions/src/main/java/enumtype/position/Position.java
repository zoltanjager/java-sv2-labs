package enumtype.position;

public enum Position {
    SECRETARY(5000,"cellphone"), SALESMANAGER(10000, "car"), ITADMIN(8000, "Laptop");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
