package com.aopdemo;

import com.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;


public class AroundWithLoggerDemoApp {
    private static Logger logger = Logger.getLogger(AroundWithLoggerDemoApp.class.getName());
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext(DemoConfig.class);
        TrafficFortuneService service =
                configApplicationContext.getBean("trafficFortuneService", TrafficFortuneService.class);
        logger.info("Main AroundDemoApp");
        logger.info("Call getFortune()");
        String data = service.getFortune(true);
        logger.info("Fortune is: " + data);
        logger.info("Finish");

    }
}
