package com.uin.structuralPattern.proxy.dynamicProxy.cglib;

import lombok.extern.slf4j.Slf4j;

/**
 * 真实角色 （没有抽象角色）
 */
@Slf4j
public class RealSubject {

  public void request() {
    log.info("Request From real subject");
  }
}
