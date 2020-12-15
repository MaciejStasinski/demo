package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo3 {

    @RequestMapping("/")
    public String a() {
        return "KURKA jest obłościanem :) lofć :*";
    }
}

