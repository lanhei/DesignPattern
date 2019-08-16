package com.lanhei.patterns.iterator;

public class NameRepository1 implements Container {
    String[] names;

    public NameRepository1(String[] names){
        this.names  = names;
    }

    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }
}
