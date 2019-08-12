package com.lanhei.patterns.command;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        System.out.println("Stock [ Name: "+abcStock.getName()+", Quantity: " + abcStock.getQuantity() +" ] bought");
    }
}
