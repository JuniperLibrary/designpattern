package com.uin.structuralPattern.compositePattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 叶子类实现 Graphic 接口，并定义具体的绘制行为。
 */
@Slf4j
public class Rectangle implements Graphic {

  @Override
  public void draw() {
    log.info("drawing a rectangle");
  }
}
