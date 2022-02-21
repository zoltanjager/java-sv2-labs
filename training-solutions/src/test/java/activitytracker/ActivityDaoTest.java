package activitytracker;

import activity.ActivityType;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    void init() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);

        Activity activity1 = new Activity(1, LocalDateTime.of(2022, 02, 17, 13, 14), "Dobogókő", Type.BIKING);
        Activity activity2 = new Activity(2, LocalDateTime.of(2022, 02, 18, 14, 14), "Normafa", Type.BIKING);
        Activity activity3 = new Activity(3, LocalDateTime.of(2022, 02, 19, 15, 14), "Pap-rét", Type.HIKING);
        Activity activity4 = new Activity(4, LocalDateTime.of(2022, 02, 20, 8, 14), "Kékes", Type.BIKING);

        activityDao.saveActivity(activity1);
        activityDao.saveActivity(activity2);
        activityDao.saveActivity(activity3);
        activityDao.saveActivity(activity4);

    }

    @Test
    void testFindActivityById(){
        Activity activity = activityDao.findActivityById(3);

        assertEquals(LocalDateTime.of(2022,02,19,15,14), activity.getStartTime());
        assertEquals("Pap-rét", activity.getDesc());
        assertEquals(ActivityType.HIKING.toString(), activity.getType().toString());
    }

    @Test
    void testListActivities(){
        List<Activity> activities = activityDao.listActivities();

        assertEquals(4, activities.size());
    }

    @Test
    void testSaveActivityGeneratedKeys(){
        Activity activity5 = new Activity(5, LocalDateTime.of(2022, 02, 20, 8, 14), "Kékes", Type.BIKING);

        Activity savedActivity = activityDao.saveActivityGeneratedKeys(activity5);

        assertEquals(5, savedActivity.getId());
    }


    @Test
    void testSaveActivitywithTrackPointsEverythingIsOK() {
        TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
        TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
        TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 18.5472280);
        TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
        TrackPoint trackPoint5 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302552, 18.5472312);
        List<TrackPoint> trackpoints = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4, trackPoint5);
        Activity activity = new Activity(5, LocalDateTime.of(2022, 02, 20, 8, 14), "Kékes", Type.BIKING, trackpoints);

        activityDao.saveActivityAndTrackPoints(activity);
        Activity expected = activityDao.findActivityWithTrackPointsById(5);

        assertTrue(activity.getStartTime().equals(expected.getStartTime()));
        assertTrue(activity.getDesc().equals(expected.getDesc()));
        assertTrue(activity.getType().equals(expected.getType()));
        assertTrue(activity.getTrackPoints().size() == expected.getTrackPoints().size());
        assertTrue(expected.getTrackPoints().equals(trackpoints));
    }


}