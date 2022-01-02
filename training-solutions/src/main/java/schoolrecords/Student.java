package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Mark> marks = new ArrayList<>();

    public Student(String name) {
        isEmptyName(name);
        this.name = name;
    }

    private void isEmptyName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }


    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

    public double calculateAverage() {
        double sum = 0.0;

        for (Mark actual : marks) {
            sum += actual.getMarkType().getMark();
        }
        return Math.round(sum / marks.size() * 100) / 100.0;
    }

    public double calculateSubjectAverage(Subject subject) {
        double sum = 0.0;
        int counter = 0;
        for (Mark actual : marks) {
            if (actual.getSubject().getSubjectName().equals(subject.getSubjectName())) {
                sum += actual.getMarkType().getMark();
                counter++;
            }
        }
        if (counter == 0) {
            return 0.0;
        }
        return Math.round(sum / counter * 100) / 100.0;
    }

    @Override
    public String toString() {
        return name + " marks: "
                + marks.get(0).getSubject().getSubjectName()
                + ": " + marks.get(0).toString();
    }

    public String getName() {
        return name;
    }
 }
