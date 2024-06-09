package com.github.williamdlm.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("greetingServiceImpl")
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi(String text) {
        return "Hi " + text;
    }

    @Override
    public String sayHello(String text) {
        return "Hello " + text;
    }
}
