package collectionscomp;

import java.text.CollationKey;
import java.text.Collator;
import java.util.*;



public class School {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>(new StudentComparator());
        Student student1 = new Student("Jane", 175);
        Student student2 = new Student("Jake", 165);
        Student student3 = new Student("Joe", 155);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);

        Map<String, Integer> students2 = new TreeMap<>(Collator.getInstance(new Locale("hu", "HU")));

        students2.put(student1.getName(),student1.getHeight());
        students2.put(student2.getName(),student2.getHeight());
        students2.put(student3.getName(),student3.getHeight());
        System.out.println(students2);
    }
}