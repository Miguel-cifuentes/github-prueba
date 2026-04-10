package com.example.githubrepaso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HelloWord")
public class helloWordController {

    @RequestMapping("/world")
    public String HelloWorld(){
        return "Hello Word";
    }

    @RequestMapping ("/HelloMiguel")
    public String HelloMiguel(){
        return "Hello Miguel";
    }


}
