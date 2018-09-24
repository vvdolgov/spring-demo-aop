package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component("accountDAO")
public class AccountDAO {
    public void getAccount(){
        System.out.println(getClass()+": DOING DB WORK");
    }
}
