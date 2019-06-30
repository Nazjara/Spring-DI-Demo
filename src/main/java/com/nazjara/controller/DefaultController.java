package com.nazjara.controller;

import com.nazjara.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class DefaultController {

    private GreetingService greetingService;

    public DefaultController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}