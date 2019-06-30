package com.nazjara.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    private static final String HELLO_WORLD = "Hello World from PrimaryGreetingService!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
