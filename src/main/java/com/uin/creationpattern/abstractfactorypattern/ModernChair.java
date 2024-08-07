package com.uin.creationpattern.abstractfactorypattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModernChair implements Chair {

  @Override
  public void sitOn() {
    log.info("Sitting on a modern chair.");
  }
}
