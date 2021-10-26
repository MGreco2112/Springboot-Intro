package com.careerdevs.intro;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/")
    public String getHello() {
        return "Hello World";
    }

    @GetMapping("/sayHello")
    public Greeting sayHello() {
        return new Greeting(42, "Hello Careerdevs");
    }
}
