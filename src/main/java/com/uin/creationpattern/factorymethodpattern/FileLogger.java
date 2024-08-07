package com.uin.creationpattern.factorymethodpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 文件日志记录器
 */
@Slf4j
public class FileLogger implements Logger {

  @Override
  public void log(String message) {
    log.info("Logging to file: " + message);
  }
}
