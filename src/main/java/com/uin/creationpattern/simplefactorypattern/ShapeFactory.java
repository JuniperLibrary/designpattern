package com.uin.creationpattern.simplefactorypattern;

public class ShapeFactory {

  // 静态方法，根据传入的参数返回具体的产品实例
  public static Shape createShape(String shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    }
    return null;
  }
}
