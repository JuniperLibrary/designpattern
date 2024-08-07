package com.uin.structurapattern.proxypattern.staticproxy;

/**
 * 客户端代码
 */
public class Main {

  public static void main(String[] args) {
    MailSender mailSender = new ProxyMailSender();
    mailSender.send("Hello, this is a test email.");
  }
}
