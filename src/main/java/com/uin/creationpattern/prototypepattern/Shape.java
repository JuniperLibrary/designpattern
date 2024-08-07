package com.uin.creationpattern.prototypepattern;

/**
 * 抽象图形接口，声明克隆方法
 */
public interface Shape extends Cloneable {

  Shape clone();

  void draw();
}
