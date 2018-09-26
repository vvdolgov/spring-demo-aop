package com.aopdemo;

import com.aopdemo.dao.Account;
import com.aopdemo.dao.AccountDAO;
import com.aopdemo.dao.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new
                AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

        Account account = new Account();
        accountDAO.getAccount(account, true);
        membershipDAO.getMembership();
        accountDAO.doWork();
        membershipDAO.goToSleep();
        accountDAO.getName();
        accountDAO.getServiceCode();
        accountDAO.setName("as");
        accountDAO.setServiceCode("123");
        context.close();
    }
}
