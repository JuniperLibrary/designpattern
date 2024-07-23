package com.uin.structuralPattern.bridgePattern.model;

import com.uin.structuralPattern.bridgePattern.DrawingAPI;
import com.uin.structuralPattern.bridgePattern.abstractModel.Shape;

/**
 * 具体抽象类，圆形
 */
public class Circle extends Shape {

  private double x, y, radius;

  public Circle(double x, double y, double radius, DrawingAPI drawingAPI) {
    super(drawingAPI);
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  @Override
  public void draw() {
    drawingAPI.drawCircle(x, y, radius);
  }

  @Override
  public void resize(double factor) {
    radius *= factor;
  }
}
