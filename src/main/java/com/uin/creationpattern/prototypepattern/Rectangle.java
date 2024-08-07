package com.uin.creationpattern.prototypepattern;

/**
 * 具体图形类：矩形
 */
public class Rectangle implements Shape {

  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public Shape clone() {
    return new Rectangle(this.width, this.height); // 克隆矩形对象
  }

  @Override
  public void draw() {
    System.out.println("Drawing a Rectangle with width " + width + " and height " + height);
  }
}
