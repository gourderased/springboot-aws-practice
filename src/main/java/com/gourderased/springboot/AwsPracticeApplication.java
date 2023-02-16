package com.gourderased.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AwsPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsPracticeApplication.class, args);
    }

}
