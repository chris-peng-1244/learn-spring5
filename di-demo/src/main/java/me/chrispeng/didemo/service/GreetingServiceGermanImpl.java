package me.chrispeng.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class GreetingServiceGermanImpl implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Ich verstehe kein Deutsch";
    }
}
