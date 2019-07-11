package com.lanhei.relation.association;

public class Test {
    public static void main(String[] args) {
        Product product1=new Product();
        product1.setName("产品1");
        Product product2=new Product();
        product2.setName("产品2");
        Product product3=new Product();
        product3.setName("产品3");
        Customer customer1=new Customer();
        customer1.setName("客户A");
        customer1.setAddress(new Address("橘园洲"));
        customer1.BuyProducts(product1);
        System.out.println(String.format("%s属于%s，客户地址：%s",product1.getName(),product1.getCustomer().getName(),product1.getCustomer().getAddress().getName()));
        customer1.BuyProducts(product2);
        System.out.println(String.format("%s属于%s，客户地址：%s",product2.getName(),product2.getCustomer().getName(),product2.getCustomer().getAddress().getName()));
        customer1.HasProducts();
        System.out.println("----------------------------");
        customer1.BuyProducts(product1);
        customer1.BuyProducts(product3);
        System.out.println(String.format("%s属于%s，客户地址：%s",product3.getName(),product3.getCustomer().getName(),product3.getCustomer().getAddress().getName()));
        customer1.HasProducts();
    }
}
