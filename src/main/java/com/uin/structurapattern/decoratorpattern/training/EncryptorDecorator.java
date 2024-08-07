package com.uin.structurapattern.decoratorpattern.training;

/**
 * 定义一个装饰抽象类，实现 Encryptor 接口，并持有一个 Encryptor 对象的引用。
 */
public abstract class EncryptorDecorator implements Encryptor {

  protected Encryptor encryptor;

  public EncryptorDecorator(Encryptor encryptor) {
    this.encryptor = encryptor;
  }

  @Override
  public String encrypt(String input) {
    return encryptor.encrypt(input);
  }

  @Override
  public String decrypt(String input) {
    return encryptor.decrypt(input);
  }
}
