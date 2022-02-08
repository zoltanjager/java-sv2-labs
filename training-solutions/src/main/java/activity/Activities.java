package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activities = new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivities(Activity activity) {
        activities.add(activity);
    }


    public int numberOfTrackActivities() {
        return (int) activities.stream()
                .filter(activity -> activity.getClass().equals(ActivityWithTrack.class))
                .count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int) activities.stream()
                .filter(activity -> activity.getClass().equals(ActivityWithoutTrack.class))
                .count();
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();

        for (ActivityType actual : ActivityType.values()) {
            double sum = activities.stream()
                    .filter(activity -> activity.getType().equals(actual))
                    .mapToDouble(Activity::getDistance)
                    .sum();
            result.add(new Report(actual, sum));
        }
        return result;
    }
}
