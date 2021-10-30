package stringconcat.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "Sales manager", 250000);

        System.out.println(employee.toString());
    }
}
