package com.lanhei.patterns.singleton;

//懒汉式（非线程安全）
public class Singleton2 {
    private static Singleton2 uniqueInstance;

    private Singleton2 (){
    }

    //没有加入synchronized关键字的版本是线程不安全的
    public static Singleton2 getInstance() {
        //判断当前单例是否已经存在，若存在则返回，不存在则再建立单例
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }

        return uniqueInstance;
    }
}
