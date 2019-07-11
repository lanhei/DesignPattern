package com.lanhei.relation.aggregation;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.setKeyBoard(new KeyBoard("雷柏键盘"));
        computer.setMouse(new Mouse("双飞燕鼠标"));
        System.out.println(String.format("这台电脑配备%s、%s",computer.getKeyBoard().getName(),computer.getMouse().getName()));
    }
}
