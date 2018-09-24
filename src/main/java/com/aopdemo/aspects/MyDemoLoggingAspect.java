package com.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
    @Before("execution(public void get*())")
    public void beforeAddAccountAdvice(){
        System.out.println("\n==========> Executing before advice on get()");
    }
}
