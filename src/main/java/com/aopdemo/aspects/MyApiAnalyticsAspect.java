package com.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {
    @Before("com.aopdemo.aspects.LuvAopExpressions.forDAOPackageNoGettersSetters()")
    public void performAnalytics(){
        System.out.println("\n==========> Perform Analytics");
    }
}
