package com.uin.structurapattern.bridgepattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体实现类，绘制到打印机
 */
@Slf4j
public class PrinterDrawingAPI implements DrawingAPI {

  @Override
  public void drawCircle(double x, double y, double radius) {
    log.info("PrinterDrawingAPI.drawCircle()");
  }

  @Override
  public void drawRectangle(double x, double y, double width, double height) {
    log.info("PrinterDrawingAPI.drawRectangle()");
  }
}
