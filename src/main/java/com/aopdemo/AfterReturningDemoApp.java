package com.aopdemo;

import com.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class AfterReturningDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO = configApplicationContext.getBean("accountDAO", AccountDAO.class);

        System.out.println("\n===========>> Main application");
        accountDAO.findAccounts();


    }
}
