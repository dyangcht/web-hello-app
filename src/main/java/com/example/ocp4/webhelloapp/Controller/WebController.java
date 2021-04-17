package com.example.ocp4.webhelloapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WebController {
    @RequestMapping("/hello/v1/{name}")
    // @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "Hello 你好, " + name + "\n";
    }

    @RequestMapping("/prod/v1/{name}")
    public String prod(@PathVariable String name) {
        return "Product name is " + name + "\n";
    }

    @RequestMapping("/query/v1/{name}")
    public String query(@PathVariable String name) {
        return "Query string is " + name + "\n";
    }
}
