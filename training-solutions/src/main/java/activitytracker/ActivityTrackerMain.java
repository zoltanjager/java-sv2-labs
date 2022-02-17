package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot reach the database!", sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        Activity activity = new Activity(1, LocalDateTime.of(2022, 02,17,13,14), "Dobogókő", Type.BIKING);
        Activity anotherActivity = new Activity(2, LocalDateTime.of(2022, 02,18,13,14), "Normafa", Type.BIKING);


        insertActivity(dataSource, activity);
        insertActivity(dataSource, anotherActivity);

    }


    private static void insertActivity(MariaDbDataSource dataSource, Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities (start_time, activity_desc, activity_type) values (?, ?, ?)")
        ) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();


        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect!", sqle);
        }
    }
}
