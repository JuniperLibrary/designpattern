package com.uin.structuralPattern.proxyPattern.dynamicProxy.jdkProxy;

import com.uin.structuralPattern.proxyPattern.staticProxy.RealSubject;
import com.uin.structuralPattern.proxyPattern.staticProxy.Subject;

public class Client {

  public static void main(String[] args) {
    RealSubject realSubject = new RealSubject();

    DynamicProxyJdk handler = new DynamicProxyJdk(realSubject);
    Subject subject = (Subject) handler.getProxyObject(handler);
    subject.request();
  }
}
