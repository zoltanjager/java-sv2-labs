package methodvarargs.gps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPointList = new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        if (timeOfLogging == null || "".equals(timeOfLogging)) {
            throw new IllegalArgumentException("Üres időpont!");
        }

        for (FieldPoint actual : fieldPointsToLog ) {
            actual.setTimeOfLogging(timeOfLogging);
            fieldPointList.add(actual);
        }
    }

    public List<FieldPoint> getFieldPointList() {
        return fieldPointList;
    }
}
