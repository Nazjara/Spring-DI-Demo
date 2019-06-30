package com.nazjara.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    private static final String HELLO_WORLD = "Hello World from ConstructorGreetingService!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
