package com.nazjara.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    private static final String HELLO_WORLD = "Hello World from GreetingServiceImpl!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
