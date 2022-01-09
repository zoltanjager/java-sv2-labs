package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {


    public Set<Integer> getOrderInLessons(List<Student> students) {
        Set<Integer> result = new TreeSet<>();
        for (Student actual : students) {
            result.add(actual.getHeight());
        }
        return result;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kis Béla", 144));
        students.add(new Student("Tóth Ottó", 154));
        students.add(new Student("Nagy József", 134));
        students.add(new Student("Kovács Géza", 140));
        students.add(new Student("Kis Péter", 122));
        students.add(new Student("Nagy Péter", 132));

        PhysicalEducation physicalEducation = new PhysicalEducation();
        System.out.println(physicalEducation.getOrderInLessons(students));

    }
}
