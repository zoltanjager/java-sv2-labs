package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students){
        List<String> firstGroup = new ArrayList<>();
        List<String> secondGroup = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).length() <= 10){
                firstGroup.add(students.get(i));
            } else {
                secondGroup.add(students.get(i));
            }
        }

        System.out.println(firstGroup.toString());
        System.out.println(secondGroup.toString());
    }

    public static void main(String[] args) {
        List<String> students = new ArrayList(Arrays.asList("Gipsz Jakab", "Kis Béla", "Tóth Ottó", "Nagy Amália"));

        StudyGroup studyGroup = new StudyGroup();
        studyGroup.printStudyGroups(students);
    }


}
