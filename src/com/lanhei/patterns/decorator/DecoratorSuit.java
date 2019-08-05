package com.lanhei.patterns.decorator;

public class DecoratorSuit extends Decorator {
    public DecoratorSuit(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿个西服");
    }
}
