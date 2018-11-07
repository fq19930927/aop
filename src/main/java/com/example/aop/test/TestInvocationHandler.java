package com.example.aop.test;

import com.example.aop.dao.Dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestInvocationHandler  implements InvocationHandler {
    Dao dao;
    public TestInvocationHandler(Dao dao){
        this.dao=dao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk");
        dao.query();
        return null;
    }
}
