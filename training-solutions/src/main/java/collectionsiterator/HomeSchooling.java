package collectionsiterator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {
    private List<OnlineLesson> lessons = new ArrayList<>();


    public void addNewLesson(OnlineLesson lesson) {
        int index = lessons.size();
        for (int i = 0; i < lessons.size() - 1; i++) {
            LocalDateTime startTimeOfLessonBefore = lessons.get(i).getStartTime();
            LocalDateTime startTimeOfLessonAfter = lessons.get(i + 1).getStartTime();
            if (startTimeOfLessonBefore.isBefore(lesson.getStartTime()) && startTimeOfLessonAfter.isAfter(lesson.getStartTime())) {
                index = i + 1;
            }
        }
        lessons.add(index, lesson);

    }

    public List<OnlineLesson> getLessons() {
        return new ArrayList<>(lessons);
    }


    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> result = new ArrayList<>();
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson onlineLesson = iterator.next();
            if (onlineLesson.getLessonTitle().equals(title)) {
                result.add(onlineLesson);
            }
        }
        return result;
    }

    public void removeLesson(LocalDateTime startTime) {
        Iterator<OnlineLesson> iterator = lessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson onlineLesson = iterator.next();
            if (onlineLesson.getStartTime().isEqual(startTime)) {
                iterator.remove();
            }
        }
    }
}
