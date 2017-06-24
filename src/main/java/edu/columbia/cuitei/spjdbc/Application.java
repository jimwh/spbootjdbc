package edu.columbia.cuitei.spjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        FooBar fooBar = ctx.getBean(FooBar.class);

        log.info("foobar = {} ", fooBar.hasJdbdTemplate());
        log.info("now = {} ", fooBar.now() );

        System.exit(0);
    }

}