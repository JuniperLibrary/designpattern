/**
 * 目标接口，定义了客户端需要的特定行为。
 * 该接口的作用是作为适配器要实现的桥梁，使得适配器能够兼容不同的接口或类。
 */
package com.uin.structurapattern.adapterpattern.classadapter;

public interface Target {

  /**
   * 客户端调用的请求方法。
   * 该方法的具体实现将在适配器类中提供，适配器类将该行为转换为它能处理的其他接口或类的行为。
   */
  void request();
}

