package com.uin.structurapattern.proxypattern.staticproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 真实角色
 */
@Slf4j
public class RealSubject implements Subject {

  @Override
  public void request() {
    log.info("request from real subject!");
  }
}
