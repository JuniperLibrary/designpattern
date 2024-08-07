package com.uin.structurapattern.proxypattern.staticproxy;

public class Client {

  public static void main(String[] args) {
    Subject subject = new ProxySubject();
    subject.request();
  }
}
