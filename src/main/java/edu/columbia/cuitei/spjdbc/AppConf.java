package edu.columbia.cuitei.spjdbc;

import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppConf {

    private static final Logger log = LoggerFactory.getLogger(AppConf.class);

    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcTemplate jdbcTemplate() {
        log.info("dataSource={}", dataSource);
        return new JdbcTemplate(dataSource);
    }
}
