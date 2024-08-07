package com.uin.structurapattern.bridgepattern.training;

/**
 * TXT文件转换器
 */
public class TXTDataConverter implements DataConverter {

  @Override
  public void convert(DataSource dataSource, String filePath) {
    String data = dataSource.getData();
    System.out.println("Converting data to TXT format and saving to " + filePath);
    // 模拟写入TXT文件
    System.out.println("TXT Data: " + data);
  }
}
