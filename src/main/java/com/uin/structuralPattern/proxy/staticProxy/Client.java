package com.uin.structuralPattern.proxy.staticProxy;

public class Client {

  public static void main(String[] args) {
    Subject subject = new ProxySubject();
    subject.request();
  }
}
