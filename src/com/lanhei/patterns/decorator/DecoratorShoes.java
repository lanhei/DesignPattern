package com.lanhei.patterns.decorator;

public class DecoratorShoes extends Decorator {
    public DecoratorShoes(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("鞋子");
    }
}
