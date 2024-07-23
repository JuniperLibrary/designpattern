/**
 * 数据源接口定义了获取数据的方法。
 * 该接口的作用是作为一个桥梁，将数据的获取逻辑与具体的实现细节解耦，使得不同的数据获取方式可以通过实现这个接口来进行统一的管理。
 */
package com.uin.structuralPattern.bridgePattern.training;

/**
 * 数据源接口
 */
public interface DataSource {

  /**
   * 获取数据的方法。
   *
   * @return 返回数据作为字符串。
   */
  String getData();
}

