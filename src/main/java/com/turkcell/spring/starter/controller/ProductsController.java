package com.turkcell.spring.starter.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

    @GetMapping
    public String hello(String name) {
        return "Hello " + name;
    }

    @GetMapping("/{name}")
    public String helloWithPathVariable(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping
    public String helloWithRequestParam(@RequestParam String name) {
        return "Hello" + name;
    }
}