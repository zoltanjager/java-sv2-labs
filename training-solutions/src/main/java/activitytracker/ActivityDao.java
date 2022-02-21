package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values(?, ?, ?);")) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert to activities!", sqle);
        }
    }

    public Activity saveActivityGeneratedKeys(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values(?, ?, ?);", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                return new Activity(rs.getInt(1), activity.getStartTime(), activity.getDesc(), activity.getType());
            }
            throw new IllegalStateException("Cannot get key!");

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert to activities!", sqle);
        }
    }




    public Activity findActivityById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id=?;")) {
            stmt.setLong(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Long foundId = rs.getLong("id");
                    LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                    String desc = rs.getString("activity_desc");
                    String type = rs.getString("activity_type");
                    return new Activity(foundId.intValue(), startTime, desc, Type.valueOf(type));
                }
                throw new IllegalStateException("Cannot find this activity");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot connect activities!", sqle);
        }
    }

    public List<Activity> listActivities(){
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

}
