package com.lanhei.patterns.decorator;

public class DecoratorTShirt extends Decorator {
    public DecoratorTShirt(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("穿个T-Shirt");
    }
}
