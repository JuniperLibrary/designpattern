package com.uin.structurapattern.proxypattern.virtualpattern.simple;

/**
 * 模拟一个创建和初始化非常耗时的对象
 */
public class ExpensiveObject {

  public ExpensiveObject() {
    System.out.println("Initializing ExpensiveObject...");
    try {
      Thread.sleep(2000); // 模拟初始化耗时
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public String getData() {
    return "Some important data";
  }

}
