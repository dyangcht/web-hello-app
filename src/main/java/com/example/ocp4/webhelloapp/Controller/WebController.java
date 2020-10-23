package com.example.ocp4.webhelloapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/web-hello")
public class WebController {
    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name;
    }
}
