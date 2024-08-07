package com.uin.structurapattern.proxypattern.dynamicproxy.jdkproxy;

import com.uin.structurapattern.proxypattern.staticproxy.RealSubject;
import com.uin.structurapattern.proxypattern.staticproxy.Subject;

public class Client {

  public static void main(String[] args) {
    RealSubject realSubject = new RealSubject();

    DynamicProxyJdk handler = new DynamicProxyJdk(realSubject);
    Subject subject = (Subject) handler.getProxyObject(handler);
    subject.request();
  }
}
