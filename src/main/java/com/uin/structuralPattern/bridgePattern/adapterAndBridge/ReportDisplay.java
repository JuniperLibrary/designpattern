/**
 * 报表显示接口
 * 该接口定义了展示报表的抽象行为。实现这个接口的类将负责具体展示报表的内容。
 */
package com.uin.structuralPattern.bridgePattern.adapterAndBridge;

/**
 * 报表显示接口
 */
public interface ReportDisplay {

  /**
   * 展示报表
   * @param data 报表数据，以字符串形式传递，包含了需要展示的报表内容。
   *             接口的实现类需要根据这个数据来生成具体的报表展示。
   */
  void displayReport(String data);
}

