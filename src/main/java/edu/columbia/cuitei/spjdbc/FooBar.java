package edu.columbia.cuitei.spjdbc;

import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class FooBar {

    private static final Logger log = LoggerFactory.getLogger(FooBar.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean hasJdbdTemplate() {
        return this.jdbcTemplate != null;
    }

    public Timestamp now() {
        foome();
        return jdbcTemplate.queryForObject("select now()", Timestamp.class);
    }

    public void foome() {
        // -Dmy.active=local -Dmy.size=big
        log.info("p1={}, p2={}", System.getProperty("my.active"), System.getProperty("my.size"));
    }
}
