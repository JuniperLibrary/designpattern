package com.uin.structurapattern.proxypattern.dynamicproxy.jdkproxy.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import lombok.extern.slf4j.Slf4j;

/**
 * 实现InvocationHandler 接口来实现动态代理
 */
@Slf4j
public class LogHandler implements InvocationHandler {

  private Object target;

  public LogHandler(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    // 在方法调用前记录日志
    log.info("Before calling method: " + method.getName());

    // 调用实际对象的方法
    Object result = method.invoke(target, args);

    // 在方法调用后记录日志
    log.info("After calling method: " + method.getName());

    return result;
  }
}
