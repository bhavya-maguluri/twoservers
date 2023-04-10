package com.example.client3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${message}")
    private String message;

    @GetMapping("/")
    public String home() {
        return message;
    }
}
