package com.lanhei.patterns.mediator;

public class MediatorPater extends AbstractMediator {
    public MediatorPater(AbstractCardPartner a, AbstractCardPartner b) {
        super(a, b);
    }

    @Override
    public void aWin(int money) {
        A.setMoney(A.getMoney()+money);
        B.setMoney(B.getMoney()-money);
    }

    @Override
    public void bWin(int money) {
        A.setMoney(A.getMoney()-money);
        B.setMoney(B.getMoney()+money);
    }
}
