package spitter.db.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import spitter.db.SpitterRepository;
import spitter.domain.Spitter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by 程浩 on 2020/11/25
 */
public class JdbcSpitterRepository implements SpitterRepository {
    private JdbcTemplate jdbcTemplate;

    public JdbcSpitterRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public long count() {
        return 0;
    }

    public Spitter save(Spitter spitter) {
        return null;
    }

    public Spitter findOne(long id) {
        return jdbcTemplate.queryForObject(
                SELECT_SPITTER + " where id=?", new SpitterRowMapper(), id);
    }

    public Spitter findByUsername(String username) {
        return null;
    }

    public List<Spitter> findAll() {
        return null;
    }

    private static final class SpitterRowMapper implements RowMapper<Spitter> {
        public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
            long id = rs.getLong("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String fullName = rs.getString("fullname");
            String email = rs.getString("email");
            boolean updateByEmail = rs.getBoolean("updateByEmail");
            return new Spitter(id, username, password, fullName, email, updateByEmail);
        }
    }

    private static final String INSERT_SPITTER = "insert into Spitter (username, password, fullname, email, updateByEmail) values (?, ?, ?, ?, ?)";

    private static final String SELECT_SPITTER = "select id, username, password, fullname, email, updateByEmail from Spitter";
}
