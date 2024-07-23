package com.uin.structuralPattern.bridgePattern.adapterAndBridge;

public class TextFileDataCollector implements DataCollector{

  private String filePath;

  public TextFileDataCollector(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public String collectData() {
    // 模拟从文本文件读取数据
    return "Data from text file at " + filePath;
  }
}
