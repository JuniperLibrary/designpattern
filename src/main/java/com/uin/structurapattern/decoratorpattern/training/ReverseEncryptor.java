package com.uin.structurapattern.decoratorpattern.training;

/**
 * 逆向输出加密
 */
public class ReverseEncryptor extends EncryptorDecorator {

  public ReverseEncryptor(Encryptor encryptor) {
    super(encryptor);
  }

  @Override
  public String encrypt(String input) {
    return new StringBuilder(encryptor.encrypt(input)).reverse().toString();
  }

  @Override
  public String decrypt(String input) {
    StringBuilder decrypted = new StringBuilder(input).reverse();
    return encryptor.decrypt(decrypted.toString());
  }
}
