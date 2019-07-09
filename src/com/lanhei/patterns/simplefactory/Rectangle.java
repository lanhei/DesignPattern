package com.lanhei.patterns.simplefactory;

public class Rectangle implements Shape {
    public Rectangle() {
        System.out.println("Rectangle");
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle");
    }

}