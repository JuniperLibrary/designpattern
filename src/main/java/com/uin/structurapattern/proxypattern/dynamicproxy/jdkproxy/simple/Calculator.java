package com.uin.structurapattern.proxypattern.dynamicproxy.jdkproxy.simple;

/**
 * 在Java中，动态代理是一种在运行时动态生成代理类的机制，它可以在不预先定义代理类的情况下实现代理功能。
 * <p>
 * Java动态代理通常依赖于 java.lang.reflect.Proxy 类和 java.lang.reflect.InvocationHandler 接口来实现。
 */
public interface Calculator {

  int add(int a, int b);
}
