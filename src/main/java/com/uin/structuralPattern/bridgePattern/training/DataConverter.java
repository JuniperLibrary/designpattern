/**
 * 数据转换接口
 * 该接口定义了如何将数据源中的数据转换到指定的文件路径中。
 * 实现这个接口的类将负责具体的数据转换逻辑，而调用者只需要关心转换的开始和结束，不需要了解转换的细节。
 */
package com.uin.structuralPattern.bridgePattern.training;

/**
 * 数据转换接口
 */
public interface DataConverter {

  /**
   * 转换数据
   * @param dataSource 数据源，提供需要转换的数据
   * @param filePath 文件路径，指定数据转换后的存储位置
   * 该方法的实现将负责从数据源中提取数据，并将其转换存储到指定的文件路径中。
   */
  void convert(DataSource dataSource, String filePath);
}
