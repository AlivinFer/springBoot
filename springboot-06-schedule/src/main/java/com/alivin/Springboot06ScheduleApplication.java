package com.alivin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class Springboot06ScheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06ScheduleApplication.class, args);
    }

}
