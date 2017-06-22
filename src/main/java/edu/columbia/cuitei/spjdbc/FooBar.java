package edu.columbia.cuitei.spjdbc;

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
}
