package com.aopdemo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {
    @Pointcut("execution(* com.aopdemo.dao.*.get*(..))")
    public void getters(){}

    @Pointcut("execution(* com.aopdemo.dao.*.set*(..))")
    public void setters(){}

    @Pointcut("execution(* com.aopdemo.dao.*.*(..))")
    public void forDAOPackage(){}

    @Pointcut("forDAOPackage()&&!(getters()||setters())")
    public void forDAOPackageNoGettersSetters(){}

}
