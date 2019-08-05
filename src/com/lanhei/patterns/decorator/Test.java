package com.lanhei.patterns.decorator;

public class Test {
    public static void main(String[] args) {
        People p1 = new DecoratorSuit(new DecoratorShirt(new Jane()));
        p1.wear();
    }
}
