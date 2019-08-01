package com.lanhei.patterns.bridge;

public class Test {
    public static void main(String[] args) {
         Color color;
         Pen pen;
         color=(Color)XMLUtilPen.getBean("color");
         pen=(Pen)XMLUtilPen.getBean("pen");
         pen.setColor(color);
         pen.draw("鲜花");
    }
}
