package com.uin.creationpattern.simplefactorypattern;

public class Client {

  public static void main(String[] args) {
    Shape shape1 = ShapeFactory.createShape("CIRCLE");
    shape1.draw();  // 输出: Drawing a Circle.

    Shape shape2 = ShapeFactory.createShape("RECTANGLE");
    shape2.draw();  // 输出: Drawing a Rectangle.
  }
}
