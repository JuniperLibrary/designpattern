package com.uin.structurapattern.proxypattern.virtualpattern.simple;

/**
 * 代理对象，控制对 ExpensiveObject 的访问。只有在第一次访问数据时，才会创建 ExpensiveObject 实例。
 */
public class VirtualProxy {

  private ExpensiveObject realObject;

  public String getData() {
    if (realObject == null) {
      realObject = new ExpensiveObject();
    }
    return realObject.getData();
  }
}
