package streamsalgorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int yearOfBirth;

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public Employee(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("John Doe", 1980),
                new Employee("Jane Doe", 1985),
                new Employee("Jack Doe", 1990),
                new Employee("Joe Doe", 1995));

        int sumOfYearOfBirth = employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .sum();

        System.out.println(sumOfYearOfBirth);

        int sumOfAge = employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .map(n -> 2022 - n)
                .sum();

        System.out.println(sumOfAge);

        long numberOfEmployees = employees.stream()
                .count();

        System.out.println(numberOfEmployees);


        long numberOfEmployeesBirthBefore1990 = employees.stream()
                .filter(e -> e.getYearOfBirth() < 1990)
                .count();

        System.out.println(numberOfEmployeesBirthBefore1990);

        int employeesBirthYearEarlier = employees.stream()
                .mapToInt(Employee::getYearOfBirth)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("Empty"));


        System.out.println(employeesBirthYearEarlier);


        String nameOfEmployeesBirthYearEarlier = employees.stream()
                .sorted((e1, e2) -> e1.getYearOfBirth() - e2.getYearOfBirth())
 //               .sorted(new Comparator<Employee>() {
 //                   @Override
 //                   public int compare(Employee o1, Employee o2) {
 //                       return o1.getYearOfBirth() - o2.getYearOfBirth();
 //                   }
 //               })
                .map(Employee::getName)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("Empty"));

        System.out.println(nameOfEmployeesBirthYearEarlier);

        boolean before1980 = employees.stream()
                .allMatch(e -> e.getYearOfBirth() < 1980);

        System.out.println(before1980);


        List<Employee> employeesBirthBefore1990 = employees.stream()
                .filter(e -> e.getYearOfBirth() < 1990)
                .collect(Collectors.toList());

        System.out.println(employeesBirthBefore1990);


        List<String> nameOfEmployees = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(nameOfEmployees);


        List<String> nameOfEmployeesBirthBefore1990 = employees.stream()
                .filter(e -> e.getYearOfBirth() < 1990)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(nameOfEmployeesBirthBefore1990);


    }
}
