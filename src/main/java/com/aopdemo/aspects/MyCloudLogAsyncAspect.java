package com.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyCloudLogAsyncAspect {
    @Before("com.aopdemo.aspects.LuvAopExpressions.forDAOPackageNoGettersSetters()")
    public void logToCloudAsync(){
        System.out.println("\n==========> Cloud logging");
    }
}
