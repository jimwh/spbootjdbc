package edu.columbia.cuitei.spjdbc;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class FooBar {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean hasJdbdTemplate() {
        return this.jdbcTemplate != null;
    }

    public Timestamp now() {
        return jdbcTemplate.queryForObject("select now()", Timestamp.class);
    }
}
