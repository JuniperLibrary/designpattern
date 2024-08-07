package com.uin.creationpattern.factorymethodpattern;

public class Client {

  public static void main(String[] args) {
    // 使用文件日志记录器
    LoggerFactory fileFactory = new FileLoggerFactory();
    Logger fileLogger = fileFactory.createLogger();
    fileLogger.log("File logging message");

    // 使用数据库日志记录器
    LoggerFactory dbFactory = new DatabaseLoggerFactory();
    Logger dbLogger = dbFactory.createLogger();
    dbLogger.log("Database logging message");
  }
}
