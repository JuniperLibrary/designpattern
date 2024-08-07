package com.uin.structurapattern.proxypattern.virtualpattern.simple;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {
    VirtualProxy proxy = new VirtualProxy();
    log.info("Proxy created");

    // 访问数据，触发真实对象的初始化
    String data = proxy.getData();
    log.info("Data: " + data);

    // 再次访问数据，不会重新初始化
    data = proxy.getData();
    log.info("Data: " + data);
  }
}
