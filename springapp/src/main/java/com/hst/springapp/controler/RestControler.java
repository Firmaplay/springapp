package com.hst.springapp.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControler {
    @GetMapping("/")
    public String helloWorld() {
        return "hello World";
    }
}
