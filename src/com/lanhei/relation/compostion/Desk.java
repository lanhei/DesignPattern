package com.lanhei.relation.compostion;

public class Desk {
    private DeskTop deskTop;
    private Leg[] legs;

    public Desk() {
        deskTop=new DeskTop("桌面");
        legs=new  Leg[4];
        legs[0]=new Leg("腿1");
        legs[1]=new Leg("腿2");
        legs[2]=new Leg("腿3");
        legs[3]=new Leg("腿4");
    }

    @Override
    public String toString() {
        return String.format("我是桌子我有一个%s，还有%s、%s、%s、%s",deskTop.getName(),legs[0].getName(),legs[1].getName(),legs[2].getName(),legs[3].getName());
    }
}
