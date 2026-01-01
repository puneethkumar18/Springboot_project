package com.example.demo.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World";
    }

    @PostMapping("/greet")
    public String greet() {
        return "Greetings from Spring Boot!";
    }
}