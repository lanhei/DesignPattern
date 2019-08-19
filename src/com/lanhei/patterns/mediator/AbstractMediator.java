package com.lanhei.patterns.mediator;

//抽象中介者类
public abstract class AbstractMediator {
    protected AbstractCardPartner A;
    protected AbstractCardPartner B;

    public AbstractMediator(AbstractCardPartner a, AbstractCardPartner b)
    {
        A = a;
        B = b;
    }

    public abstract void aWin(int money);
    public abstract void bWin(int money);
}
