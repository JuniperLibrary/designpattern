/**
 * 目标接口，定义了客户端需要调用的方法。
 * 这个接口的作用是作为适配器要实现的接口，以满足客户端的需求。
 */
package com.uin.structuralPattern.adapterPattern.objectAdapter;

public interface Target {

  /**
   * 客户端调用的请求方法。
   * 该方法的具体实现将由适配器提供，以适配另一个接口的实现。
   */
  void request();

}

