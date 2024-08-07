package com.uin.creationpattern.factorymethodpattern;

/**
 * 抽象日志记录器工厂
 */
public interface LoggerFactory {

  Logger createLogger();
}