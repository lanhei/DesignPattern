package com.lanhei.patterns.factoryabstract;

public class RectangleFactory implements Factory {
    @Override
    public Shape getShape() {
        // TODO: implement
        return new Rectangle();
    }

}
