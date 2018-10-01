package com.aopdemo;

import com.aopdemo.dao.Account;
import com.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class AfterThrowingDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO = configApplicationContext.getBean("accountDAO", AccountDAO.class);

        System.out.println("\n===========>> Main application");
        List<Account> accounts = null;
        try{
           accounts = accountDAO.findAccounts(true);
        }
        catch(Exception e){
            System.out.println("Main application ... caught exception: " + e);
        }
    }
}
