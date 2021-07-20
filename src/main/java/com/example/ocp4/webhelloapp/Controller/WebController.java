package com.example.ocp4.webhelloapp.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController

public class WebController {
    @RequestMapping("/hello/v2/{name}")
    // @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        RestTemplate restTemplate = new RestTemplate();
        System.out.println("hello v2");
        restTemplate.getForObject("http://web-hello-app.demo1.svc.cluster.local:8080/hello/v1/" + name, Value.class);
        return name + " 您好，這是版本二！\n";
    }

    @RequestMapping("/prod/v2/{name}")
    public String prod(@PathVariable String name) {
        System.out.println("product");
        return "Product name is " + name + "\n";
    }

    @RequestMapping("/query/v2/{name}")
    public String query(@PathVariable String name) {
        System.out.println("query");
        return "Query string is " + name + "\n";
    }

    @PostMapping("/post/v2")
    public String postMethod(@RequestBody String name) {
        System.out.println("post method ...");
        return "Post string is " + name + "\n";
    }
//
}
