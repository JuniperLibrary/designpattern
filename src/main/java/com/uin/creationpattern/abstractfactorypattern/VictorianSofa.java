package com.uin.creationpattern.abstractfactorypattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VictorianSofa implements Sofa {

  @Override
  public void lieOn() {
    log.info("Lying on a Victorian sofa.");
  }
}
