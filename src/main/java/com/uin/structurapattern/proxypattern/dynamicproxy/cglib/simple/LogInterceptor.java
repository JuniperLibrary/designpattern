package com.uin.structurapattern.proxypattern.dynamicproxy.cglib.simple;

import java.lang.reflect.Method;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 实现 MethodInterceptor 接口来实现动态代理逻辑
 */
@Slf4j
public class LogInterceptor implements MethodInterceptor {

  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
    // 在方法调用前记录日志
    log.info("Before calling method: " + method.getName());

    // 调用被代理对象的方法
    Object result = proxy.invokeSuper(obj, args);

    // 在方法调用后记录日志
    log.info("After calling method: " + method.getName());

    return result;
  }
}
