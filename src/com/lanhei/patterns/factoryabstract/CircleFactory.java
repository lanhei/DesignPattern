package com.lanhei.patterns.factoryabstract;

public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        // TODO: implement
        return new Circle();
    }

}