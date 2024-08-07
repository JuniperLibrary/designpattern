package com.uin.creationpattern.simplefactorypattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 圆形
 */
@Slf4j
public class Circle implements Shape {

  @Override
  public void draw() {
    log.info("Drawing a Circle.");
  }
}