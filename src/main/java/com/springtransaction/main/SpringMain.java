package com.springtransaction.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.springtransaction.*")
@EntityScan("com.springtransaction.*")
public class SpringMain {
    public static void main(String[] args) {
        SpringApplication.run(SpringMain.class, args);
    }
}