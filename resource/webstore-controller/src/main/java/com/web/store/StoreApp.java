package com.web.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.web.store"})
public class StoreApp {

    public static void main(String[] args) {
        SpringApplication.run(StoreApp.class, args);
    }

}

