package com.lanhei.patterns.builder;

public class MealB extends MealBuilder{
    @Override
    public void buildDrink() {
        meal.setDrink("柠檬果汁");
    }

    @Override
    public void buildFood() {
        meal.setFood("鸡翅");
    }
}
