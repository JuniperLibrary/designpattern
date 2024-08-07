package com.uin.creationpattern.factorymethodpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 数据库日志记录器
 */
@Slf4j
public class DatabaseLogger implements Logger {

  @Override
  public void log(String message) {
    log.info("Logging to database: " + message);
  }
}