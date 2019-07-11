package com.lanhei.relation.association;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Product> products;
    private Address address;
    private String name;

    public Customer()
    {
        products=new ArrayList<Product>();
    }

    public void BuyProducts(Product product)
    {
        for (Product item : products) {
            if(item.getName()==product.getName())
            {
                System.out.println(String.format("%s已经被%s买了",product.getName(),product.getCustomer().getName()));
                return;
            }
        }

        product.setCustomer(this);
        products.add(product);
    }

    public void  HasProducts() {
        for (Product product : products) {
            System.out.println(String.format("%s购买%s", product.getCustomer().getName(), product.getName()));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
