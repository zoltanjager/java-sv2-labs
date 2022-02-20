package activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        Activity activity = new Activity(1, LocalDateTime.of(2022, 02, 17, 13, 14), "Dobogókő", Type.BIKING);
        Activity anotherActivity = new Activity(2, LocalDateTime.of(2022, 02, 18, 13, 14), "Normafa", Type.BIKING);


        insertActivity(dataSource, activity);
        insertActivity(dataSource, anotherActivity);
        List<Activity> activities = findAllActivities(dataSource);
        System.out.println(activities.size());
    }

        public static Optional<Activity> findActivityById (DataSource dataSource, Long id){
            try (Connection conn = dataSource.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("select * from activities where id=?;")) {
                stmt.setLong(1, id);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        Long foundId = rs.getLong("id");
                        LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                        String desc = rs.getString("activity_desc");
                        String type = rs.getString("activity_type");
                        return Optional.of(new Activity(id.intValue(), startTime, desc, Type.valueOf(type)));
                    }
                    return Optional.empty();
                }
            } catch (SQLException sqle) {
                throw new IllegalStateException("Cannot connect activities!", sqle);
            }
        }

        public static List<Activity> findAllActivities (DataSource dataSource){
            List<Activity> result = new ArrayList<>();
            try (Connection conn = dataSource.getConnection();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("select * from activities;")
            ) {
                while (rs.next()) {
                    Long id = rs.getLong("id");
                    LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                    String desc = rs.getString("activity_desc");
                    String type = rs.getString("activity_type");
                    result.add(new Activity(id.intValue(), startTime, desc, Type.valueOf(type)));
                }
            } catch (SQLException sqle) {
                throw new IllegalStateException("Cannot query activities!", sqle);
            }
            return result;
        }

        private static void insertActivity (DataSource dataSource, Activity activity){
            try (Connection conn = dataSource.getConnection();
                 PreparedStatement stmt = conn.prepareStatement("insert into activities (start_time, activity_desc, activity_type) values (?, ?, ?);")
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

