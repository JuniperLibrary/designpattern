package com.uin.structurapattern.proxypattern.dynamicproxy.jdkproxy.simple;

import java.lang.reflect.Proxy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

  public static void main(String[] args) {
    // 创建实际对象
    CalculatorImpl calculator = new CalculatorImpl();

    // 创建动态代理对象
    Calculator proxy = (Calculator) Proxy.newProxyInstance(Calculator.class.getClassLoader(), new Class[]{Calculator.class},
        new LogHandler(calculator));

    // 使用代理对象调用方法
    int result = proxy.add(3, 5);
    log.info("result: {}", result);
  }
}
