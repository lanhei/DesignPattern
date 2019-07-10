package com.lanhei.relation.dependency;

public class Test {
    public static void main(String[] args) {
        Human human=new Human();
        Book book=new Book();
        book.setName("书");
        human.read(book);
        Food food=new Food();
        food.setName("饭");
        human.eat(food);
    }
}
