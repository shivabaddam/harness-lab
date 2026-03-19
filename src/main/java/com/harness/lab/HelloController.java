package com.harness.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Harness CI/CD Kubernetes Lab!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}
