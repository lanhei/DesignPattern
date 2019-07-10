package com.lanhei.relation.generalization;

public class Test {
    public static void main(String[] args) {
        Animal bird=new Bird();
        Animal fish=new Fish();
        bird.eat();
        ((Bird) bird).fly();
        fish.eat();
        ((Fish) fish).swim();
    }
}
