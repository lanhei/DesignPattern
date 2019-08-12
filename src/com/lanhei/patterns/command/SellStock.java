package com.lanhei.patterns.command;

public class SellStock implements Order  {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        System.out.println("Stock [ Name: "+abcStock.getName()+", Quantity: " + abcStock.getQuantity() +" ] sold");
    }
}
