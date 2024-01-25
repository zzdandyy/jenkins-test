package com.example.jenkinstest.service;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class HelloServiceTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void testSayHello() {
        helloService.hello();
        assertEquals(20, 20);
    }

    @Test
    public void test1() {
        int i1 = helloService.hello1(2);
        assertEquals(1, i1);
        int i2 = helloService.hello1(1);
        assertEquals(0, i2);
    }

    @Test
    public void test4() {
        int i1 = helloService.hello4(2);
        assertEquals(6, i1);
        int i2 = helloService.hello4(1);
        assertEquals(3, i2);
    }
}