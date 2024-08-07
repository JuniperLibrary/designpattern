package com.uin.structurapattern.adapterpattern.twowayadapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiceB implements ClientB{

  @Override
  public void requestB() {
    log.info("serviceB requestB");
  }
}
