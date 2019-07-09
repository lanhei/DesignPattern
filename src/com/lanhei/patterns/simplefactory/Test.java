package com.lanhei.patterns.simplefactory;

public class Test {
    public static void main(String[] args) {
        Circle circle = (Circle) ShapeFactory.getClass(Circle.class);
        circle.draw();

        Rectangle rectangle = (Rectangle) ShapeFactory.getClass(Rectangle.class);
        rectangle.draw();

        Square square = (Square) ShapeFactory.getClass(Square.class);
        square.draw();
    }
}
