package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();


    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student) {
        if (isStudentExist(student)) {
            return false;
        } else {
            students.add(student);
            return true;
        }
    }

    public boolean removeStudent(Student student) {
        if (isStudentExist(student)) {
            students.remove(student);
            return true;
        } else {
            return false;
        }
    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        double sum = 0;
        for (Student actual : students) {
            sum += actual.calculateAverage();
        }
        if (sum == 0.0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.round(sum / students.size() * 100) / 100.0;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double sum = 0.0;
        int counter = 0;
        for (Student actual : students) {
            if (actual.calculateSubjectAverage(subject) != 0.0) {
                sum += actual.calculateSubjectAverage(subject);
                counter++;
            }
        }
        return Math.round(sum / counter * 100) / 100.0;
    }

    public Student findStudentByName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }

        for (Student actual : students) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        int number = random.nextInt(0, students.size());
        return students.get(number);
    }

    public List<StudyResultByName> listStudyResults() {
        List<StudyResultByName> listOfStudyResults = new ArrayList<>();
        for (Student actual : students) {
            listOfStudyResults.add(new StudyResultByName(actual.getName(), actual.calculateAverage()));
        }
        return listOfStudyResults;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Student actual : students) {
            if (first) {
                sb.append(actual.getName());
                first = false;
            } else {
                sb.append(", ").append(actual.getName());
            }
        }
        return sb.toString();
    }

    public String getClassName() {
        return className;
    }

    private boolean isStudentExist(Student student) {
        for (Student actual : students) {
            if (actual.getName().equals(student.getName())) {
                return true;
            }
        }
        return false;
    }
}
