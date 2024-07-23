package com.uin.structuralPattern.bridgePattern.abstractModel;

import com.uin.structuralPattern.bridgePattern.DrawingAPI;

/**
 * 抽象类，定义图形操作
 */
public abstract class Shape {

  protected DrawingAPI drawingAPI;

  protected Shape(DrawingAPI drawingAPI) {
    this.drawingAPI = drawingAPI;
  }

  public abstract void draw();

  public abstract void resize(double factor);
}
