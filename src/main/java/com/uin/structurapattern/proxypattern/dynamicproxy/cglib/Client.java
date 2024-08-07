package com.uin.structurapattern.proxypattern.dynamicproxy.cglib;

public class Client {

  public static void main(String[] args) {
    RealSubject realSubject = new RealSubject();
    DynamicProxyCglib proxyCglib = new DynamicProxyCglib(realSubject);
    RealSubject subject = (RealSubject) proxyCglib.getProxyObject(realSubject);
    subject.request();
  }
}
