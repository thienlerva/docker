package com.thien.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/message")
    public String getMessage() {
        return "This is docker application";
    }
}
