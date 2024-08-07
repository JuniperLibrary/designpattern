package com.uin.structurapattern.compositepattern.safacompositepattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Circle implements Graphic{

  @Override
  public void draw() {
    log.info("draw circle");
  }
}
