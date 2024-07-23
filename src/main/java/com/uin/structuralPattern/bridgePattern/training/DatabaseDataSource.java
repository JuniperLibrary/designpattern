package com.uin.structuralPattern.bridgePattern.training;

/**
 * 数据库数据源实现
 */
public class DatabaseDataSource implements DataSource {

  private String connectionString;

  public DatabaseDataSource(String connectionString) {
    this.connectionString = connectionString;
  }


  @Override
  public String getData() {
    // 模拟从数据库读取数据
    return "Data from database at " + connectionString;
  }
}
