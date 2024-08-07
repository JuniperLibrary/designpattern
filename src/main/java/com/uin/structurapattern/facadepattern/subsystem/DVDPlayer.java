package com.uin.structurapattern.facadepattern.subsystem;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统类：DVD播放器
 *
 * @author dingchuan
 */
@Slf4j
public class DVDPlayer {

  public void on() {
    log.info("DVD Player is on.");
  }

  public void off() {
    log.info("DVD Player is off.");
  }

  public void play(String movie) {
    log.info("Playing " + movie);
  }
}
