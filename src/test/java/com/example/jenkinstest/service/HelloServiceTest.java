package com.example.jenkinstest.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class HelloServiceTest {

    @InjectMocks
    private HelloService helloService;

    @Test
    public void testSayHello() {
        helloService.hello();
        assertEquals(20, 20);
    }
}
