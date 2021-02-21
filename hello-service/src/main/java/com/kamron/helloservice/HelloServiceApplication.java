package com.kamron.helloservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@SpringBootApplication
public class HelloServiceApplication {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(HelloServiceApplication.class, args);
    }

    @GetMapping("/msg")
    public String msg() {
        return String.format("Hello from <b>hello-service</b> at port: <b>%S</b>", port);
    }
}
