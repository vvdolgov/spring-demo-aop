package com.aopdemo.service;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class TrafficFortuneService {
    public String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Expect heavy traffic this morning";
    }

    public String getFortune(boolean tripWide) {
        if (tripWide){
            throw new RuntimeException("Major accident! Highway is closed!");
        }

        return getFortune();
    }
}
