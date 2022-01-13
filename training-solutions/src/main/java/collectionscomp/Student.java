package collectionscomp;

public class Student {
    private String name;
    private Integer height;

    public Student(String name, Integer height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
