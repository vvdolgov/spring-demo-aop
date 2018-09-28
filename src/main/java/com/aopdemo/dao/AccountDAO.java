package com.aopdemo.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("accountDAO")
public class AccountDAO {
    private String name;
    private String serviceCode;
    public void getAccount(Account account, boolean vip){
        System.out.println(getClass()+": DOING DB WORK");
    }

    public boolean doWork(){
        System.out.println(getClass()+": doWork");
        return false;
    }

    public String getName() {
        System.out.println(getClass()+ ": int getName");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass()+ ": int setName");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass()+ ": int getServiceCode");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass()+ ": int setServiceCode");
        this.serviceCode = serviceCode;
    }

    public List<Account> findAccounts(){
        List<Account> accounts = new ArrayList<Account>();
        accounts.add(new Account("Sam", "1"));
        accounts.add(new Account("Din", "2"));
        accounts.add(new Account("Bob", "3")) ;
        return accounts;
    }
}
