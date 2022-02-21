package activitytracker;

import activity.ActivityType;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
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
}