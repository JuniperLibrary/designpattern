package com.uin.creationpattern.prototypepattern;

public class Client {
  public static void main(String[] args) {
    // 创建原型对象
    Shape circle = new Circle(10);
    Shape rectangle = new Rectangle(5, 7);

    // 克隆原型对象
    Shape clonedCircle = circle.clone();
    Shape clonedRectangle = rectangle.clone();

    // 输出结果
    circle.draw();          // 输出: Drawing a Circle with radius 10
    clonedCircle.draw();    // 输出: Drawing a Circle with radius 10

    rectangle.draw();       // 输出: Drawing a Rectangle with width 5 and height 7
    clonedRectangle.draw(); // 输出: Drawing a Rectangle with width 5 and height 7
  }
}