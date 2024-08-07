/**
 * 数据采集接口定义了采集数据的方法。
 * 该接口的作用是提供一个标准的接口，用于不同数据采集实现的抽象。
 * 具体的数据采集逻辑由实现该接口的类来完成。
 */
package com.uin.structurapattern.bridgepattern.adapterandbridge;

/**
 * 数据采集接口
 */
public interface DataCollector {

  /**
   * 收集数据的方法。
   * 该方法的具体实现将决定如何收集数据。
   *
   * @return 返回收集到的数据，以字符串形式表示。
   */
  String collectData();
}

