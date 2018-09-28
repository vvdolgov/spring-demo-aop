package com.aopdemo.aspects;

import com.aopdemo.dao.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
    @AfterReturning(pointcut = "execution (* com.aopdemo.dao.AccountDAO.findAccounts(..))",
    returning = "result")
    public void afterReturningFindAccountAdvice(JoinPoint joinPoint, List<Account> result){
        String method = joinPoint.getSignature().toShortString();
        System.out.println("\n=========>>> Method: "+ method);
        System.out.println("\n=========>>> Result: "+ result);


    }

    @Before("com.aopdemo.aspects.LuvAopExpressions.forDAOPackageNoGettersSetters()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n==========> Executing before advice on get()");
    }
}
