package org.hudas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Ignas on 2017-02-25.
 */
@SpringBootApplication
@ComponentScan({
        "org.hudas.controllers",
        "org.hudas.repositories",
})
@EnableJpaRepositories
@EntityScan(basePackages = {"org.hudas.entities"})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
