package me.chrispeng.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceBonjourImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Bonjour";
    }
}
