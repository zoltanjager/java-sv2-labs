package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Gipsz Jakab"));
        students.add(new Student("Kis Géza"));
        students.add(new Student("Tóth Ottó"));
        students.add(new Student("Kis Kata"));

        for (Student student: students
             ) {
            System.out.println(student.getName());
            System.out.println(student.isActive());
        }

        System.out.println(students.size());

        System.out.println();

        students.get(0).setActive(false);
        students.get(2).setActive(false);

        for (int i = 0; i < students.size(); i++) {
            if (!students.get(i).isActive()){
                students.remove(i);
            }
        }

        for (Student student: students
        ) {
            System.out.println(student.getName());
            System.out.println(student.isActive());
        }

        System.out.println(students.size());
    }
}
