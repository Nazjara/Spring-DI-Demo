package com.nazjara.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class SpanishGreetingService implements GreetingService {

    private static final String HELLO_WORLD = "Hola mundo desde el servicio de saludo español!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
