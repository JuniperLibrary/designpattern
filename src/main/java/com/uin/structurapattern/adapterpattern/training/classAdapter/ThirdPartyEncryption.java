package com.uin.structurapattern.adapterpattern.training.classAdapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 第三方加密类
 */
@Slf4j
public class ThirdPartyEncryption {

  public String encryptData(String data) {
    // 模拟第三方加密算法的实现
    log.info("Encrypting data using third party encryption algorithm");
    return "Encrypted(" + data + ")";
  }
}
