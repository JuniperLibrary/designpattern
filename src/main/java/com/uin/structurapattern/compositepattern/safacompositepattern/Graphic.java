package com.uin.structurapattern.compositepattern.safacompositepattern;
/**
 * Graphic接口定义了图形对象的行为。
 * 任何实现了此接口的类都必须提供一个绘制该图形的方法。
 */
public interface Graphic {

  /**
   * 绘制图形。
   * 此方法没有参数和返回值。
   * 具体的绘制行为由实现此接口的类定义。
   */
  void draw();
}

