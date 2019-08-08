package com.lanhei.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    private Object proxied;   // 被代理对象

    public ProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)  throws Throwable {

        // 在转调具体目标对象之前，可以执行一些功能处理
        System.out.println("前置增强处理： yoyoyo...");

        // 转调具体目标对象的方法(三要素：实例对象 + 实例方法 + 实例方法的参数)
        Object obj = method.invoke(proxied, args);

        // 在转调具体目标对象之后，可以执行一些功能处理
        System.out.println("后置增强处理：hahaha...");

        return obj;
    }
}
