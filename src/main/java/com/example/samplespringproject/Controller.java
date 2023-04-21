package com.example.samplespringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/hi")
    public void getHi(){
        System.out.println("Hi");
    }
}
