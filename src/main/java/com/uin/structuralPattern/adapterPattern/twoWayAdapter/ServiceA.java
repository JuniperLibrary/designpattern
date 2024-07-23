package com.uin.structuralPattern.adapterPattern.twoWayAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServiceA implements ClientA{

  @Override
  public void requestA() {
    log.info("serviceA requestA");
  }
}
