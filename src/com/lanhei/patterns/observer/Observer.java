package com.lanhei.patterns.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
