package com.uin.structurapattern.compositepattern.transparentcompositepattern;


import lombok.extern.slf4j.Slf4j;

/**
 * 叶子类实现 Graphic 接口，但对于添加、删除子节点和获取子节点的方法，可以选择抛出异常或提供空实现。
 */
@Slf4j
public class Circle implements Graphic {

  @Override
  public void draw() {
    log.info("draw circle");
  }

  @Override
  public void add(Graphic graphic) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void remove(Graphic graphic) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Graphic getChild(int index) {
    throw new UnsupportedOperationException();
  }
}
