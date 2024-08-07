package com.uin.structurapattern.adapterpattern.defaultadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体的实现类，选择性地覆盖感兴趣的方法
 */
@Slf4j
public class CustomEventListener extends DefaultEventListener {

  @Override
  public void onClick() {
    log.info("Custom onClick event.");
  }
}
