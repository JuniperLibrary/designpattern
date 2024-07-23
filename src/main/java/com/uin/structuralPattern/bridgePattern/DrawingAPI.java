package com.uin.structuralPattern.bridgePattern;

/**
 * 假设我们要设计一个图形绘制系统，其中包括不同的图形（例如圆形和矩形）和不同的绘图方式（例如绘制到屏幕或打印机）。我们可以使用桥接模式来将图形与绘图方式解耦。
 */
public interface DrawingAPI {

  /**
   * 绘制一个圆。
   *
   * @param x 圆心的横坐标。
   * @param y 圆心的纵坐标。
   * @param radius 圆的半径。
   */
  void drawCircle(double x, double y, double radius);

  /**
   * 绘制一个矩形。
   *
   * @param x 矩形左上角的横坐标。
   * @param y 矩形左上角的纵坐标。
   * @param width 矩形的宽度。
   * @param height 矩形的高度。
   */
  void drawRectangle(double x, double y, double width, double height);
}
