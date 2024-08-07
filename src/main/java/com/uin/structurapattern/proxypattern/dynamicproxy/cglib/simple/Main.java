package com.uin.structurapattern.proxypattern.dynamicproxy.cglib.simple;

import org.springframework.cglib.proxy.Enhancer;

public class Main {

  public static void main(String[] args) {
    // 创建 Enhancer 对象，用于生成代理类
    Enhancer enhancer = new Enhancer();
    // 设置被代理类的父类
    enhancer.setSuperclass(Calculator.class);
    // 设置回调接口
    enhancer.setCallback(new LogInterceptor());

    // 创建代理对象
    Calculator proxy = (Calculator) enhancer.create();

    // 使用代理对象调用方法
    int result = proxy.add(3, 5);
    System.out.println("Result: " + result);
  }
}
