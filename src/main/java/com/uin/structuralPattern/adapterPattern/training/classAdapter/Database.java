package com.uin.structuralPattern.adapterPattern.training.classAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 数据库操作类（假设已经存在）
 */
@Slf4j
public class Database {

  public void saveEncryptedData(String data) {
    log.info("Saving to database: " + data);
  }
}
