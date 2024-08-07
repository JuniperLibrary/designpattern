package com.uin.structurapattern.bridgepattern.adapterandbridge;

/**
 * 从数据库读取数据
 */
public class DatabaseDataCollector implements DataCollector {

  @Override
  public String collectData() {
    // 模拟从数据库读取数据
    return "Data from database";
  }
}
