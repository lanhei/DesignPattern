package com.lanhei.patterns.mediator;

//牌友B
public class PartnerB extends AbstractCardPartner {
    @Override
    public void changeMoney(int money, AbstractMediator mediator) {
       mediator.bWin(money);
    }
}
