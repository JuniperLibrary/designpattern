package com.uin.structurapattern.adapterpattern.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 旧系统类，具有旧的接口
 */
@Slf4j
public class OldSystem {

  // 转发调用
  public void specificRequest() {
    log.info("OldSystem specificRequest()");
  }
}
