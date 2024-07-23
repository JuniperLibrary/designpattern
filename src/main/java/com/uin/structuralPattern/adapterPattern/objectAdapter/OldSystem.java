package com.uin.structuralPattern.adapterPattern.objectAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 旧系统类，具有旧的接口
 */
@Slf4j
public class OldSystem {

  public void specificRequest() {
    log.info("OldSystem specificRequest()");
  }
}
