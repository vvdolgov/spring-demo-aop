package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void getMembership(){
        System.out.println(getClass() + ": DOING STAFF");
    }
    public String goToSleep(){
        System.out.println(getClass()+": hey, i'm going to sleep now...");
        return "Yep!";
    }
}
