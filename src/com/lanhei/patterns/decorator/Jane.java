package com.lanhei.patterns.decorator;

// 具体的对象，该对象将被附加一些额外的操作
public class Jane implements People {
    @Override
    public void wear() {
        System.out.println("今天该穿什么呢?");
    }
}
