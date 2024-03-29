package com.nazjara.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingService implements GreetingService {

    private static final String HELLO_WORLD = "Hello World from PrimaryGreetingService!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
