package com.nhnacademy.springbootaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootAccountApplication.
 */
@SpringBootApplication
public class SpringBootAccountApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootAccountApplication.class);
        application.run(args);
    }

}
