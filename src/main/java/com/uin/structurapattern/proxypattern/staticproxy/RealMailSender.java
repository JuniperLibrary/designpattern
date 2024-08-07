package com.uin.structurapattern.proxypattern.staticproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 真实主题类
 * <p>
 * 实现了 MailSender 接口，负责实际发送邮件的功能。
 */
@Slf4j
public class RealMailSender implements MailSender {

  @Override
  public void send(String message) {
    log.info("发送邮件：{}", message);
  }
}
