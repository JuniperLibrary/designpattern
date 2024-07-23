package com.uin.structuralPattern.compositePattern.safaCompositePattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Rectangle implements Graphic{

  @Override
  public void draw() {
    log.info("draw Rectangle");
  }
}
