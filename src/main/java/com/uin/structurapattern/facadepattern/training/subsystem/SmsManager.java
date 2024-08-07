package com.uin.structurapattern.facadepattern.training.subsystem;

import lombok.extern.slf4j.Slf4j;

/**
 * 子系统类：短信管理
 */
@Slf4j
public class SmsManager {

  public void backupSms() {
    System.out.println("Backing up SMS...");
    // 实现备份短信的逻辑
  }
}
