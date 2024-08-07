package com.uin.structurapattern.proxypattern.staticproxy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 代理类
 * <p>
 * 实现了 MailSender 接口，它在发送邮件前后可以添加额外的操作，如日志记录、权限验证等。
 */
@Slf4j
@RequiredArgsConstructor
public class ProxyMailSender implements MailSender {

  private final RealMailSender realMailSender;

  public ProxyMailSender() {
    this.realMailSender = new RealMailSender();
  }

  @Override
  public void send(String message) {
    // 可以在发送之前做一些额外的操作
    log.info("Proxying before sending...");
    realMailSender.send(message);
    // 可以在发送之后做一些额外的操作
    log.info("Proxying after sending...");
  }
}
