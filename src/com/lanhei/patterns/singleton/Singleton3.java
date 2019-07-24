package com.lanhei.patterns.singleton;

//懒汉式（线程安全）
public class Singleton3 {
    private volatile static Singleton3 uniqueInstance;

    private Singleton3 (){
    }

    //没有加入synchronized关键字的版本是线程不安全的
    public static Singleton3 getInstance() {

        synchronized(Singleton3.class) {
            //判断当前单例是否已经存在，若存在则返回，不存在则再建立单例
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton3();
            }
        }

        return uniqueInstance;
    }
}
