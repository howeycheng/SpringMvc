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
 *
 * @author howey
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

    public Spitter findOne(int id) {
        return jdbcTemplate.queryForObject(
                SELECT_SPITTER + " where project_id =?", new SpitterRowMapper(), id);
    }

    public Spitter findByUsername(String username) {
        return null;
    }

    public List<Spitter> findAll() {
        return null;
    }

    private static final class SpitterRowMapper implements RowMapper<Spitter> {
        public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
            int projectId = rs.getInt("project_id");
            String name = rs.getString("name");
            String description = rs.getString("description");
            String createUser = rs.getString("create_user");
            return new Spitter(projectId, name, description, createUser);
        }
    }

    private static final String INSERT_SPITTER = "insert into Spitter (project_id, name, description, create_user) values (?, ?, ?, ?, ?)";

    private static final String SELECT_SPITTER = "select project_id, name, description, create_user from project";
}
