package com.uin.creationpattern.factorymethodpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 文件日志记录器工厂
 */
@Slf4j
public class FileLoggerFactory implements LoggerFactory {

  @Override
  public Logger createLogger() {
    return new FileLogger();
  }
}