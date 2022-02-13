package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RequestMapping(path = "/")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping
    public String hello() {
        return "<b> Hello </b> world <br /> " +
                "<a href='/api/v1/users/'> /api/v1/users/</a>";
    }
}