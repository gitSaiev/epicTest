package ru.saiev.epictest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@SpringBootApplication
public class EpicTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EpicTestApplication.class, args);
    }

}
