package com.lanhei.patterns.prototype;

public class MessageBox implements  Product {

    //保存的是装饰方框使用的字符样式
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length=s.getBytes().length;

        for (int i = 0; i < length+4; i++) {
            System.out.print(decochar);
        }

        System.out.println("");
        System.out.println(decochar+" "+s+" "+decochar);

        for (int i = 0; i < length+4; i++) {
            System.out.print(decochar);
        }

        System.out.println("");
    }

    //该方法用于复制自己
    @Override
    public Product creatClone() {
        Product p=null;

        try {
            p=(Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return p;
    }
}
