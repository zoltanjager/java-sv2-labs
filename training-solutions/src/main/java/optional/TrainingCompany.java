package optional;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;

public class TrainingCompany {

    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> course = Optional.empty();

        for (Course actual : courses) {
            if (actual.getPrice() <= maxPrice) {
                course = Optional.of(actual);
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Integer> price = Optional.empty();
        for (Course actual : courses) {
            if (actual.getName().equals(name) && actual.getLevel().equals(level)) {
                price = Optional.of(actual.getPrice());
            }
        }

        return price.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public String getNameOfCourseWithGivenLevel(Level level) {

        Optional<String> name = Optional.empty();
        for (Course actual : courses) {
            if (actual.getLevel().equals(level)) {
                name = Optional.of(actual.getName());
            }
        }

        return name.orElse("Sorry, there is no course at this level.");

    }
}
