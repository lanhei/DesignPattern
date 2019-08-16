package com.lanhei.patterns.iterator;

public class StringArrayIterator implements Iterator {
    String[] args;
    int index = 0;
    public StringArrayIterator(String[] argsTemp){
        this.args  = argsTemp;
    }

    @Override
    public boolean hasNext(){
        if(index < args.length){
            return true;
        }
        return false;
    }

    @Override
    public Object next(){
        if(index < args.length){
            return args[index++];
        }
        return null;
    }
}
