package com.example.jenkinstest.service;


import org.junit.Test;

public class HelloServiceTest {

    @Test
    public void testSayHello() {
        HelloService helloService = new HelloService();
        helloService.hello();
    }
}
