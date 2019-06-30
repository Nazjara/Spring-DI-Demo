package com.nazjara.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    private static final String HELLO_WORLD = "Hello World from SetterGreetingService!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
