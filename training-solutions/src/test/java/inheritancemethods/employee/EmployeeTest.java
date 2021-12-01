package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test

    void testCreateEmployee() {
        Employee employee = new Employee("John Doe", "Budapest Váci út", 100_000);

        assertEquals("John Doe", employee.getName());
        assertEquals("Budapest Váci út", employee.getAddress());
        assertEquals(100_000, employee.getSalary());
    }

    @Test

    void testRaiseSalary() {
        Employee employee = new Employee("John Doe", "Budapest Váci út", 100_000);

        employee.raiseSalary(10);

        assertEquals(110_000,employee.getSalary());
    }
}