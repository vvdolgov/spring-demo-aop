package com.aopdemo.aspects;

import com.aopdemo.dao.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.hibernate.mapping.Join;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {
    
    private static Logger logger = Logger.getLogger(MyDemoLoggingAspect.class.getName());

    @Around("execution(* com.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint point) throws Throwable{
        logger.info("\n=====>>> Executing @Around on method: "+ point.getSignature().toShortString());
        try {
            long begin = System.currentTimeMillis();
            Object result = point.proceed();
            long end = System.currentTimeMillis();

            logger.info("Duration: " + (end - begin) / 1000.0 + "sec");
            return result;
        }
        catch (Exception e){
            throw e;
        }
    }

    @After("execution(* com.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountAdvice(JoinPoint joinPoint){
        logger.info("After (finally) Method : " + joinPoint.getSignature().toShortString());
    }

    @AfterReturning(pointcut = "execution (* com.aopdemo.dao.AccountDAO.findAccounts(..))",
    returning = "result")
    public void afterReturningFindAccountAdvice(JoinPoint joinPoint, List<Account> result){
        String method = joinPoint.getSignature().toShortString();
        logger.info("\n=========>>> Method: "+ method);
        logger.info("\n=========>>> Result: "+ result);
    }
    @AfterThrowing(pointcut = "execution(* com.aopdemo.dao.AccountDAO.findAccounts(..))",
        throwing = "theExc"
    )
    public void afterThrowingFindAccountAdvice(JoinPoint joinPoint, Throwable theExc){
        logger.info("Method: " + joinPoint.getSignature().toShortString());
        logger.info("Exception: " + theExc);
    }

    @Before("com.aopdemo.aspects.LuvAopExpressions.forDAOPackageNoGettersSetters()")
    public void beforeAddAccountAdvice(){
        logger.info("\n==========> Executing before advice on get()");
    }
}
