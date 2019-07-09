package com.lanhei.patterns.simplefactory;

public class Circle implements Shape {
    public Circle() {
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }

}
