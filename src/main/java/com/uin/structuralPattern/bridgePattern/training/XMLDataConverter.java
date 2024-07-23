package com.uin.structuralPattern.bridgePattern.training;

/**
 * XML文件转换器
 */
public class XMLDataConverter implements DataConverter {

  @Override
  public void convert(DataSource dataSource, String filePath) {
    String data = dataSource.getData();
    System.out.println("Converting data to XML format and saving to " + filePath);
    // 模拟写入XML文件
    System.out.println("XML Data: <data>" + data + "</data>");
  }
}
