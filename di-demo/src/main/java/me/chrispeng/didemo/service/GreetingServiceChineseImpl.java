package me.chrispeng.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceChineseImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "你好";
    }
}
