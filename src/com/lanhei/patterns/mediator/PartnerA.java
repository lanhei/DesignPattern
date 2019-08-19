package com.lanhei.patterns.mediator;

//牌友A
public class PartnerA extends AbstractCardPartner {
    @Override
    public void changeMoney(int money, AbstractMediator mediator) {
        mediator.aWin(money);
    }
}
