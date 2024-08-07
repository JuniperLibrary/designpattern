package com.uin.structurapattern.flyweightpattern;

/**
 * 定义享元接口
 * <p>
 * 假设我们需要管理大量的文字字符对象，每个字符对象可能会有一些共享的状态，比如字符本身，而每个字符的颜色和字体大小等则是外部状态。
 */
public interface Flyweight {

  void display(Character character, String extrinsicState);
}
