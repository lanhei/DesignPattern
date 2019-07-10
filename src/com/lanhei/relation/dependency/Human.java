package com.lanhei.relation.dependency;

public class Human {
    /** @param book
     * @pdOid a9115c63-3dd8-4bce-8a0e-512b45871629 */
    public void read(Book book) {
        System.out.println("读"+book.getName());
    }

    /** @param food
     * @pdOid 8a8b16fa-39f7-435a-96c9-0f6ceb75757b */
    public void eat(Food food) {
        System.out.println("吃"+food.getName());
    }
}
