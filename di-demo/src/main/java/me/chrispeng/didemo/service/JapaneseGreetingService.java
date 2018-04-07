package me.chrispeng.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("jp")
@Primary
public class JapaneseGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "おはよう";
    }
}
