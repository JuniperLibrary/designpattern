package com.uin.structurapattern.proxypattern.dynamicproxy.jdkproxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


@Slf4j
public class DynamicProxyJdk implements InvocationHandler {

  private Object sub;

  public DynamicProxyJdk(Object obj) {
    this.sub = obj;
  }

  public Object getProxyObject(InvocationHandler handler) {
    Class<?> classType = sub.getClass();
    /**
     * classType.getClassLoader() 类加载器
     * sub.getClass().getInterfaces() 接口
     * handler   处理器
     *
     */
    return Proxy.newProxyInstance(classType.getClassLoader(),
        sub.getClass().getInterfaces(),
        handler);
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    this.beforeRequest();
    // 真实角色完成的事情
    method.invoke(sub, args);
    this.afterRequest();
    return null;
  }

  private void beforeRequest() {
    log.info("before request!");
  }

  private void afterRequest() {
    log.info("after request");
  }
}
