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

    public int hello3(int c) {
        int temp = 0;
        for (int i = 0; i < c; i++) {
            temp += 2;
        }
        return temp;
    }

    public int hello4(int c) {
        int temp = 0;
        for (int i = 0; i < c; i++) {
            temp += 3;
        }
        return temp;
    }

    public int hello5(int c) {
        int temp = 0;
        for (int i = 0; i < c; i++) {
            temp += 4;
        }
        return temp;
    }
}
