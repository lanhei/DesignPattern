package com.lanhei.patterns.adapter;

//继承方式实现
public class M5DataLineAdapter extends M4DataLine implements Target {
    @Override
    public void connection() {
        System.out.println("插入 type-c 转接头");
        super.connection1();
    }
}
