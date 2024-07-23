package com.uin.structuralPattern.decoratorPattern.training;

/**
 * 实现一个具体的加密算法，比如简单的移位加密。
 */
public class SimpleEncryptor implements Encryptor {

  /**
   * 移位加密的关键参数，表示字符移位的数量。
   */
  private int shift;

  public SimpleEncryptor(int shift) {
    this.shift = shift;
  }

  @Override
  public String encrypt(String input) {
    StringBuilder encrypted = new StringBuilder();
    for (char ch : input.toCharArray()) {
      if (Character.isLetter(ch)) {
        char base = Character.isUpperCase(ch) ? 'A' : 'a';
        char encryptedChar = (char) ((ch - base + shift) % 26 + base);
        encrypted.append(encryptedChar);
      } else {
        encrypted.append(ch);
      }
    }
    return encrypted.toString();
  }

  @Override
  public String decrypt(String input) {
    StringBuilder decrypted = new StringBuilder();
    for (char ch : input.toCharArray()) {
      if (Character.isLetter(ch)) {
        char base = Character.isUpperCase(ch) ? 'A' : 'a';
        char decryptedChar = (char) ((ch - base - shift + 26) % 26 + base);
        decrypted.append(decryptedChar);
      } else {
        decrypted.append(ch);
      }
    }
    return decrypted.toString();
  }
}
