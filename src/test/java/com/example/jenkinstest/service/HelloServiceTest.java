package com.example.jenkinstest.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloServiceTest {

    @Test
    public void testSayHello() {
        HelloService helloService = new HelloService();
        helloService.hello();
    }
}
