package com.lanhei.patterns.singleton;

//饿汉方式(线程安全)
public class Singleton1 {
    //在静态初始化器中创建单例实例，这段代码保证了线程安全
    private static Singleton1 uniqueInstance = new Singleton1();

    //Singleton类只有一个构造方法并且是被private修饰的，所以用户无法通过new方法创建该对象实例
    private Singleton1(){}

    public static Singleton1 getInstance(){
        return uniqueInstance;
    }
}
