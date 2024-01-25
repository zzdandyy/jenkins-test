package com.example.jenkinstest.service;

import org.springframework.stereotype.Service;

@Service
public class HiService {

    public void hi() {
        System.out.println("Hello World!");
    }

    public int hi1(int a) {
        if (a == 1) {
            return 0;
        } else {
            return 1;
        }
    }
}
