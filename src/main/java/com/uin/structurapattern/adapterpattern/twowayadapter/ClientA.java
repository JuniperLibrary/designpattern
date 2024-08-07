/**
 * 接口ClientA定义了客户端A的操作接口。
 * 客户端A可能是一个系统、一个模块或者一个具体的类，它需要与另一个系统、模块或类进行交互，
 * 但是它们之间的接口不兼容，这时需要使用适配器模式来解决这个问题。
 * 本接口定义了客户端A所需要调用的方法，通过适配器，客户端A可以调用原本不兼容的接口。
 */
package com.uin.structurapattern.adapterpattern.twowayadapter;

public interface ClientA {

  /**
   * 请求方法A。
   * 该方法是客户端A需要执行的操作，具体的实现将在适配器中完成。
   * 适配器会将客户端A的请求转换为对另一个系统、模块或类的调用，
   * 从而实现两个不兼容接口之间的通信。
   */
  void requestA();
}
