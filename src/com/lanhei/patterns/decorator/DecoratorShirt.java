package com.lanhei.patterns.decorator;

public class DecoratorShirt extends Decorator {
    public DecoratorShirt(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿个衬衫");
    }
}
