package com.uin.structurapattern.bridgepattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现类，绘制到屏幕
 */
@Slf4j
public class ScreenDrawingAPI implements DrawingAPI {

  @Override
  public void drawCircle(double x, double y, double radius) {
    log.info("Drawing circle at ({}, {}), radius {}", x, y, radius);
  }

  @Override
  public void drawRectangle(double x, double y, double width, double height) {
    log.info("Drawing rectangle at ({}, {}), width {} and height {}", x, y, width, height);
  }
}
