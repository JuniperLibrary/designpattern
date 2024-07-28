package com.uin.structuralPattern.facadePattern.subSystem;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统类 ： 投影仪
 */
@Slf4j
public class Projector {

  public void on() {
    log.info("Projector is on.");
  }

  public void off() {
    log.info("Projector is off.");
  }

  public void wideScreenMode() {
    log.info("Projector in widescreen mode.");
  }
}
