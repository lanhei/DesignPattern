package com.lanhei.patterns.adapter;

public class Test {
    public static void main(String[] args) {
//        Target target = new M5DataLine();
//        target.connection();
//
//        Target adapter = new M5DataLineAdapter();
//        adapter.connection();

        Target adapter = new M5DataLineAdapter1(new M4DataLine());
        adapter.connection();
    }
}
