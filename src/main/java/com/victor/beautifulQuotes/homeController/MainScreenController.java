package com.victor.beautifulQuotes.homeController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainScreenController {

    @RequestMapping
    public String mainScreen(){
        return "Welcome to Beautiful Quotes!";
    }
}
