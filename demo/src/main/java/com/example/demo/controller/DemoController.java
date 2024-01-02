package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/demo")
public class DemoController {

    @GetMapping
    public String getAll(){
        return "aboba";
    }

    @PostMapping
    public String postR(@RequestBody String aboba) {
        return "biba";
    }
}
