package com.uin.structuralPattern.facadePattern.subSystem;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统类：音响系统
 */
@Slf4j
public class SoundSystem {

  public void on() {
    log.info("Sound System is on.");
  }

  public void off() {
    log.info("Sound System is off.");
  }

  public void setVolume(int level) {
    log.info("Sound System volume set to " + level);
  }
}
