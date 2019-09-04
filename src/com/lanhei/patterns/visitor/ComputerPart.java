package com.lanhei.patterns.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
