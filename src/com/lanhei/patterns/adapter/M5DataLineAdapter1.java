package com.lanhei.patterns.adapter;

//组合方式实现
public class M5DataLineAdapter1 implements Target  {
    private M4DataLine target;

    public M5DataLineAdapter1(M4DataLine target) {
        this.target = target;
    }

    @Override
    public void connection() {
        System.out.println("插入 type-c 转接头");
        target.connection1();
    }
}
