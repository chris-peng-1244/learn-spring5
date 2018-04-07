package me.chrispeng.didemo.controller;

import me.chrispeng.didemo.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void hello() {
        System.out.println(greetingService.sayGreeting());
    }
}
