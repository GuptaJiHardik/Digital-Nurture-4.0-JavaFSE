package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeApplication {

    public static void main(String[] args) {

        System.out.println("Project is Running");
        SpringApplication.run(CodeApplication.class, args);
    }

}
