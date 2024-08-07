package com.uin.structurapattern.compositepattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 叶子类实现 Graphic 接口，并定义具体的绘制行为。
 */
@Slf4j
public class Circle implements Graphic {

  @Override
  public void draw() {
    log.info("drawing a Circle");
  }
}
