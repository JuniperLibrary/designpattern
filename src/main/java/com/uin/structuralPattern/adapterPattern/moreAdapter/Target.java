/**
 * 新的接口，定义了目标行为。
 * 这个接口的作用是提供一个标准的API，让不同的实现能够兼容并被统一调用。
 */
package com.uin.structuralPattern.adapterPattern.moreAdapter;

/**
 * 新的接口
 */
public interface Target {

  /**
   * 执行请求的方法。
   * 该方法定义了目标行为的具体执行逻辑，实现该接口的类需要提供对应的实现。
   */
  void request();
}

