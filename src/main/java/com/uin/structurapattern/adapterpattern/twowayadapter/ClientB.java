package com.uin.structurapattern.adapterpattern.twowayadapter;

/**
 * 客户端B的接口，定义了客户端B特有的请求操作。
 * 该接口用于客户端B的系统，提供了特定的业务行为。
 */
public interface ClientB {

  /**
   * 执行客户端B特有的请求操作。
   * 该方法具体实现了客户端B的业务逻辑，其他系统通过该方法与客户端B进行交互。
   */
  void requestB();
}

