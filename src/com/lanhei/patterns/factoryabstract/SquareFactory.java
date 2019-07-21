package com.lanhei.patterns.factoryabstract;

public class SquareFactory implements Factory {
    @Override
    public Shape getShape() {
        // TODO: implement
        return new Square();
    }

}