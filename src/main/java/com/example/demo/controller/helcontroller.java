package com.example.demo.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "分页")
@RestController
@RequestMapping("/hello1")
public class helcontroller {
    @GetMapping("/qq1")
    public String get1() {
        return "hello1";
    }

    @GetMapping("/qq2")
    public String get2() {
        return "hello1";
    }

    @GetMapping("/qq3")
    public String get3() {
        return "hello1";
    }
}
