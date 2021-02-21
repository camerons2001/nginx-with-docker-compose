package com.kamron.hiservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hi")
@RestController
@SpringBootApplication
public class HiServiceApplication {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(HiServiceApplication.class, args);
    }

    @GetMapping("/msg")
    public String msg() {
        return String.format("Hello from <b>hi-service</b> at port: <b>%s</b>", port);
    }
}
