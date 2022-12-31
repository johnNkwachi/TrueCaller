package com.semicolon.truecaller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TruecallerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TruecallerApplication.class, args);
    }

}
