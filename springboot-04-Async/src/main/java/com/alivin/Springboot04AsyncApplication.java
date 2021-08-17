package com.alivin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class Springboot04AsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04AsyncApplication.class, args);
    }

}
