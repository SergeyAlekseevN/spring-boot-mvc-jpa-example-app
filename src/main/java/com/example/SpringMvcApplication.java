package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringMvcApplication.class, args);
    }
}
