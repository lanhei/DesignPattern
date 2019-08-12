package com.lanhei.patterns.command;

public class Test {
    public static void main(String[] args) {
        Stock abcStock = new Stock("ABC",10);
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();
    }
}
