package com.lanhei.patterns.mediator;

//抽象牌友类
public abstract class AbstractCardPartner {
    private int money;

    public abstract void changeMoney(int money, AbstractMediator mediator);

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
