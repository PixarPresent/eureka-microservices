package com.example.wow.eurekaclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${message}")  // Используйте свойство из конфига
    private String customProperty;

    @GetMapping("/config")
    public String getConfigProperty() {
        return "Value from config: " + customProperty;
    }
}
