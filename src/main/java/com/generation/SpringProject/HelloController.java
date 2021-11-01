package com.generation.SpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Ich bin Diego, Grüßen von Spring Boot! ";
    }
}
