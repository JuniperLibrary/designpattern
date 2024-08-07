package com.uin.creationpattern.simplefactorypattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 矩形
 */
@Slf4j
public class Rectangle implements Shape {

  @Override
  public void draw() {
    log.info("Drawing a Rectangle.");
  }
}
