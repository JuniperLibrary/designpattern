package com.uin.structurapattern.bridgepattern.training;

/**
 * 数据转换器，使用桥接模式
 */
public class DataConversionTool {

  private DataConverter converter;
  private DataSource dataSource;

  public DataConversionTool(DataConverter converter, DataSource dataSource) {
    this.converter = converter;
    this.dataSource = dataSource;
  }

  public void convertData(String filePath) {
    converter.convert(dataSource, filePath);
  }
}
