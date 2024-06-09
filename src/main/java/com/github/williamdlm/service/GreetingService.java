package com.github.williamdlm.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
@WebService
public interface GreetingService {
    @WebMethod
    String sayHi(String text);

    @WebMethod
    String sayHello(String text);
}
