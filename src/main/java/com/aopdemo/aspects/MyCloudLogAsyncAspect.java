package com.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyCloudLogAsyncAspect {
    @Pointcut("execution(* com.aopdemo.dao.*.get*(..))")
    public void getters(){}

    @Pointcut("execution(* com.aopdemo.dao.*.set*(..))")
    public void setters(){}

    @Pointcut("execution(* com.aopdemo.dao.*.*(..))")
    public void forDAOPackage(){}

    @Pointcut("forDAOPackage()&&!(getters()||setters())")
    public void forDAOPackageNoGettersSetters(){}

    @Before("forDAOPackageNoGettersSetters()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n==========> Executing before advice on get()");
    }

    @Before("forDAOPackageNoGettersSetters()")
    public void performAnalytics(){
        System.out.println("\n==========> Perform Analytics");
    }

    @Before("forDAOPackageNoGettersSetters()")
    public void logToCloudAsync(){
        System.out.println("\n==========> Cloud logging");
    }
}
