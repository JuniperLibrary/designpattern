package com.uin.structurapattern.proxypattern.staticproxy.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * 代理角色
 */
public class ProxySubject implements Subject {

  // 代理角色内部引入了真实的角色
  private RealSubject realSubject;

  @Override
  public void request() {
    // 在真实角色操作之前所附加的操作
    this.beforeRequest();

    if (null == realSubject) {
      realSubject = new RealSubject();
    }
    // 真实角色所完成的事情
    realSubject.request();

    // 在真实角色操作之后所附加的操作
    this.afterRequest();
  }

  private void beforeRequest() {
    log.info("before request!");
  }

  private void afterRequest() {
    log.info("after request");
  }
}
