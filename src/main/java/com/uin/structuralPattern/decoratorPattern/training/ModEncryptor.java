package com.uin.structuralPattern.decoratorPattern.training;

/**
 * 求模加密
 */
public class ModEncryptor extends EncryptorDecorator {

  private int modValue;

  public ModEncryptor(Encryptor encryptor, int modValue) {
    super(encryptor);
    this.modValue = modValue;
  }

  @Override
  public String encrypt(String input) {
    StringBuilder encrypted = new StringBuilder();
    for (char ch : encryptor.encrypt(input).toCharArray()) {
      encrypted.append((char) ((ch + modValue) % 256));
    }
    return encrypted.toString();
  }

  @Override
  public String decrypt(String input) {
    StringBuilder decrypted = new StringBuilder();
    for (char ch : input.toCharArray()) {
      decrypted.append((char) ((ch - modValue + 256) % 256));
    }
    return encryptor.decrypt(decrypted.toString());
  }
}
