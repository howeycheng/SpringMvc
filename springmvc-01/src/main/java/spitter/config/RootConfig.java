package spitter.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author howey
 */
@Configuration
@ComponentScan(basePackages = {"spitter"})
public class RootConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource db = new DriverManagerDataSource();
        db.setDriverClassName("com.mysql.jdbc.Driver");
        db.setUrl("jdbc:mysql://127.0.0.1:3306/manager");
        db.setUsername("root");
        db.setPassword("root");
        return db;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
