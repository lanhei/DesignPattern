package com.lanhei.patterns.bridge;

public class MiddlePen extends Pen {
    @Override
    public void draw(String name) {
        String penType="中号毛笔绘制";
        this.color.bepaint(penType,name);
    }
}
