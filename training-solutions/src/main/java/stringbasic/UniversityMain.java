package stringbasic;

import java.util.Arrays;

public class UniversityMain {
    public static void main(String[] args) {
        University university = new University();

        Person person = new Person("John Doe",
                "john.doe@bme.hu", "333444555",
                "12345678-12345678", "1234567" );

        Student student = new Student(person, "333444", "445566");

        university.addStudent(student);

        Person anotherPerson = new Person("Jane Doe",
                "jane@doa@elte.hu", "444555666",
                "23456789-23456789", "2345678");
        Student anotherStudent = new Student(anotherPerson, "444555", "556677");

        System.out.println((student.getPerson()));

        System.out.println(university.areEqual(student, anotherStudent));

        student.setIdStudent("1111");
        anotherStudent.setIdStudent("1111");

        student.setIdNeptun("3333");
        anotherStudent.setIdNeptun("3333");

        System.out.println(university.areEqual(student, anotherStudent));

    }

}
