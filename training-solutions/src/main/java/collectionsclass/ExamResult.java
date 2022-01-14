package collectionsclass;

import java.util.Objects;

public class ExamResult implements Comparable<ExamResult>{
    private String name;
    private int point;

    public ExamResult(String name, int point) {
        this.name = name;
        this.point = point;
    }


    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResult that = (ExamResult) o;
        return point == that.point && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, point);
    }

    @Override
    public int compareTo(ExamResult o) {
        return Integer.valueOf(point).compareTo(o.getPoint());
    }
}
