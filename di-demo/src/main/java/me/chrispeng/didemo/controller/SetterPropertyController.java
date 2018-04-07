package me.chrispeng.didemo.controller;

import me.chrispeng.didemo.service.GreetingService;
import me.chrispeng.didemo.service.GreetingServiceBonjourImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterPropertyController {
    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("greetingServiceBonjourImpl")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
