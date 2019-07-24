package com.lanhei.patterns.singleton;

//懒汉式(双重检查加锁版本)
public class Singleton4 {
    //volatile保证，当uniqueInstance变量被初始化成Singleton实例时，多个线程可以正确处理uniqueInstance变量
    private volatile static Singleton4 uniqueInstance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        //检查实例，如果不存在，就进入同步代码块
        if (uniqueInstance == null) {
            //只有第一次才彻底执行这里的代码
            synchronized (Singleton4.class) {
                //进入同步代码块后，再检查一次，如果仍是null，才创建实例
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton4();
                }
            }
        }

        return uniqueInstance;
    }
}
