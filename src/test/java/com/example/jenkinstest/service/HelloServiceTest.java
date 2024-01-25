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
    public void test() {
        helloService.hello();
    }

    @Test
    public void test1() {
        int i1 = helloService.hello1(2);
        assertEquals(1, i1);
        int i2 = helloService.hello1(1);
        assertEquals(0, i2);
    }

    @Test
    public void test2() {
        int i1 = helloService.hello2(2);
        assertEquals(2, i1);
        int i2 = helloService.hello2(1);
        assertEquals(1, i2);
    }

    @Test
    public void test3() {
        int i1 = helloService.hello3(2);
        assertEquals(4, i1);
        int i2 = helloService.hello3(1);
        assertEquals(2, i2);
    }

    @Test
    public void test4() {
        int i1 = helloService.hello4(2);
        assertEquals(6, i1);
        int i2 = helloService.hello4(1);
        assertEquals(3, i2);
    }

    @Test
    public void test5() {
        int i1 = helloService.hello5(2);
        assertEquals(8, i1);
        int i2 = helloService.hello5(1);
        assertEquals(4, i2);
    }
}