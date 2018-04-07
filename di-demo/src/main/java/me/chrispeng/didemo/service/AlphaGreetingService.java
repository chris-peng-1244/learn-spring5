package me.chrispeng.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("en")
@Primary
public class AlphaGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "This is the Alpha talking";
    }
}
