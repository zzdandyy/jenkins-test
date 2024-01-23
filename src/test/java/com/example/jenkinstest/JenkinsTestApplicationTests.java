package com.example.jenkinstest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class JenkinsTestApplicationTests {

    @Test
    void contextLoads() {
        assertEquals(20, 20);
    }

}
