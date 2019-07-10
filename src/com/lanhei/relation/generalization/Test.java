package com.lanhei.relation.generalization;

public class Test {
    public static void main(String[] args) {
        Bird bird=new Bird();
        Fish fish=new Fish();
        bird.eat();
        bird.fly();
        fish.eat();
        fish.swim();
    }
}
