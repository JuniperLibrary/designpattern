package com.uin.structurapattern.proxypattern.staticproxy;

/**
 * 演示如何使用静态代理模式来实现对邮件发送的控制和额外功能的增加。
 * <p>
 * 邮件发送接口
 */
public interface MailSender {

  void send(String message);
}
