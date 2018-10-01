package com.aopdemo;

import com.aopdemo.dao.Account;
import com.aopdemo.dao.AccountDAO;
import com.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class AroundDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext(DemoConfig.class);
        TrafficFortuneService service =
                configApplicationContext.getBean("trafficFortuneService", TrafficFortuneService.class);
        System.out.println("Main AroundDemoApp");
        System.out.println("Call getFortune()");
        String data = service.getFortune();
        System.out.println("Fortune is: " + data);
        System.out.println("Finish");
    }
}
