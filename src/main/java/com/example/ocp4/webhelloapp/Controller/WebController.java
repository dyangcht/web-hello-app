package com.example.ocp4.webhelloapp.Controller;

import org.springframework.web.bind.annotation.*;

@RestController

public class WebController {
    @RequestMapping("/hello/v1/{name}")
    // @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        System.out.println("hello");
        return "Hello 你好, " + name + "\n";
    }

    @RequestMapping("/prod/v1/{name}")
    public String prod(@PathVariable String name) {
        System.out.println("product");
        return "Product name is " + name + "\n";
    }

    @RequestMapping("/query/v1/{name}")
    public String query(@PathVariable String name) {
        System.out.println("query");
        return "Query string is " + name + "\n";
    }

    @PostMapping("/post/v1")
    public String postMethod(@RequestBody String name) {
        System.out.println("post method ...");
        return "Post string is " + name + "\n";
    }
}
