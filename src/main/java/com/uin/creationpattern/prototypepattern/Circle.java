package com.uin.creationpattern.prototypepattern;

// 具体图形类：圆形
public class Circle implements Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public Shape clone() {
    return new Circle(this.radius); // 克隆圆形对象
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Circle with radius " + radius);
  }
}