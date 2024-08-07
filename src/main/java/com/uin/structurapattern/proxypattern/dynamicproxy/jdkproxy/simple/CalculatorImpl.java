package com.uin.structurapattern.proxypattern.dynamicproxy.jdkproxy.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * 实际的接口实现类
 */
@Slf4j
public class CalculatorImpl implements Calculator {

  @Override
  public int add(int a, int b) {
    return a + b;
  }
}
