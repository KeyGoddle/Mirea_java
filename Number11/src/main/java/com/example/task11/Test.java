package com.example.task11;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/")
    public String page(){
        return "It's a main page!";
    }

    @RequestMapping("/test")
    public String display(){
        return "Attention! Thanks for your attention!";
    }

}
