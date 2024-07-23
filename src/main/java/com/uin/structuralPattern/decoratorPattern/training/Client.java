package com.uin.structuralPattern.decoratorPattern.training;

import lombok.extern.slf4j.Slf4j;

/**
 * 在客户端代码中，组合不同的加密算法，进行多重加密和解密。
 */
@Slf4j
public class Client {

  public static void main(String[] args) {
    Encryptor simpleEncryptor = new SimpleEncryptor(3);
    log.info("Original: HelloWorld");

    // 第一次加密：简单加密
    Encryptor simpleEncrypted = new SimpleEncryptor(3);
    String encrypted = simpleEncrypted.encrypt("HelloWorld");
    log.info("Simple Encrypted:{} ", encrypted);

    // 第二次加密：逆向输出加密
    Encryptor reverseEncryptor = new ReverseEncryptor(simpleEncrypted);
    String reverseEncrypted = reverseEncryptor.encrypt("HelloWorld");
    log.info("Reverse Encrypted: {}", reverseEncrypted);

    // 第三次加密：求模加密
    Encryptor modEncryptor = new ModEncryptor(reverseEncryptor, 5);
    String modEncrypted = modEncryptor.encrypt("HelloWorld");
    log.info("Mod Encrypted: {}", modEncrypted);

    // 解密过程
    String decrypted = modEncryptor.decrypt(modEncrypted);
    log.info("Decrypted with Mod: {}", decrypted);
    decrypted = reverseEncryptor.decrypt(decrypted);
    log.info("Decrypted with Reverse: {}", decrypted);
    decrypted = simpleEncrypted.decrypt(decrypted);
    log.info("Decrypted with Simple:{} ", decrypted);
  }
}
