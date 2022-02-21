package activitytrackerspring;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

public class ActivityDao {

    private JdbcTemplate jdbcTemplate;

    public ActivityDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void saveActivity(Activity activity) {
        jdbcTemplate.update("insert into activities(start_time, activity_desc, activity_type) values(?, ?, ?);",
                activity.getStartTime(), activity.getDesc(), activity.getType().toString());
    }

    public Activity findActivityById(long id) {

        return jdbcTemplate.queryForObject("select * from activities where id=?;", (rs, rowNum) -> {
            return new Activity(rs.getInt("id"),
                    rs.getTimestamp("start_time").toLocalDateTime(),
                    rs.getString("activity_desc"),
                    Type.valueOf(rs.getString("activity_type")));
        }, id);

    }
}
