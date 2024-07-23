/**
 * 加密解密接口。
 * 提供加密和解密方法，用于定义加密解密行为。
 */
package com.uin.structuralPattern.decoratorPattern.training;

/**
 * 为了实现一个多重加密系统，使用装饰模式是非常合适的。装饰模式允许我们将不同的加密算法动态地组合在一起，从而实现多层次的加密。下面是如何使用装饰模式设计这个系统的详细步骤和代码示例。
 */
public interface Encryptor {

  /**
   * 加密方法。
   *
   * @param input 待加密的字符串。
   * @return 加密后的字符串。
   */
  String encrypt(String input);

  /**
   * 解密方法。
   *
   * @param input 待解密的字符串。
   * @return 解密后的字符串。
   */
  String decrypt(String input);
}
