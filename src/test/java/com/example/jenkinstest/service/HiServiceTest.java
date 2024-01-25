package com.example.jenkinstest.service;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class HiServiceTest {

    @Autowired
    private HiService hiService;

    @Test
    public void test1() {
        int i1 = hiService.hi1(2);
        assertEquals(1, i1);
        int i2 = hiService.hi1(1);
        assertEquals(0, i2);
    }

    @Test
    public void test2() {
        int i1 = hiService.hi2(2);
        assertEquals(1, i1);
        int i2 = hiService.hi2(1);
        assertEquals(0, i2);
    }
}