package com.lanhei.patterns.proxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
//        RealMovie realmovie = new RealMovie();
//        Movie movie = new Cinema(realmovie);
//        movie.play();

        // 真实对象real
        Subject real = new RealSubject();

        // 生成real的代理对象
        Subject proxySubject = (Subject) Proxy.newProxyInstance(
                Subject.class.getClassLoader(), new Class[] { Subject.class },
                new ProxyHandler(real));

        proxySubject.doSomething();
        System.out.println("代理对象的类型 ： " + proxySubject.getClass().getName());
        System.out.println("代理对象所在类的父类型 ： " + proxySubject.getClass().getGenericSuperclass());
    }
}
