package com.uin.structurapattern.bridgepattern.training;

/**
 * PDF文件转换器
 */
public class PDFDataConverter implements DataConverter {

  @Override
  public void convert(DataSource dataSource, String filePath) {
    String data = dataSource.getData();
    System.out.println("Converting data to PDF format and saving to " + filePath);
    // 模拟写入PDF文件
    System.out.println("PDF Data: " + data);
  }
}
