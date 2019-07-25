package com.lanhei.patterns.builder;

public class MealA extends MealBuilder{

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }

    @Override
    public void buildFood() {
        meal.setFood("薯条");
    }
}
