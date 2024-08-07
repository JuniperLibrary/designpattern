package com.uin.structurapattern.adapterpattern.twowayadapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiceA implements ClientA{

  @Override
  public void requestA() {
    log.info("serviceA requestA");
  }
}
