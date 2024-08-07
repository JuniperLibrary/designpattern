/**
 * 抽象组件接口Room定义了装饰对象的基本行为。
 * 装饰器模式中的装饰对象通过实现这个接口来提供额外的功能。
 */
package com.uin.structurapattern.decoratorpattern;

/**
 * 抽象组件
 */
public interface Room {

  /**
   * 装饰函数，用于增加或修改房间的特性或行为。
   * 具体的装饰对象将在这个方法中实现特定的装饰逻辑。
   */
  void decorate();
}
