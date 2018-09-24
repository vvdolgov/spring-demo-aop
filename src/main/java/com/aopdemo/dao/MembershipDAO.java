package com.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void getMembership(){
        System.out.println(getClass() + ": DOING STAFF");
    }
}
