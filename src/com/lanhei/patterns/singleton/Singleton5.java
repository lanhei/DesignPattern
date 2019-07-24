package com.lanhei.patterns.singleton;

//懒汉式（登记式/静态内部类方式）
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5 (){}

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
