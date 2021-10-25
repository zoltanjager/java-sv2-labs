package intromethods.employee;

import java.time.LocalDate;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", LocalDate.of(2010, 10, 1),5000);

        System.out.println(employee.toString());

        employee.raiseSalary(1000);

        System.out.println(employee.toString());
    }
}
