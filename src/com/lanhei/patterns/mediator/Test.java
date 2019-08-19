package com.lanhei.patterns.mediator;

public class Test {
    public static void main(String[] args) {
        AbstractCardPartner A = new PartnerA();
        AbstractCardPartner B = new PartnerB();
        A.setMoney(20);
        B.setMoney(20);

        AbstractMediator mediator = new MediatorPater(A, B);
        // A赢了
        A.changeMoney(5, mediator);
        System.out.println("A 现在的钱是："+A.getMoney());
        System.out.println("B 现在的钱是："+B.getMoney());
    }
}
