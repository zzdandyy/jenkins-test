package com.example.jenkinstest.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void hello() {
        System.out.println("Hello World!");
    }

    public int hello1(int a) {
        if (a == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public int hello2(int b) {
        int temp = 0;
        for (int i = 0; i < b; i++) {
            temp += 1;
        }
        return temp;
    }
}
