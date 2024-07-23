package com.uin.structuralPattern.adapterPattern.classAdapter;

/**
 * 类适配器，继承自旧系统并实现新的接口
 */
public class ClassAdapter extends OldSystem implements Target {

  @Override
  public void request() {
    // 调用旧系统的特定请求方法
    specificRequest();
  }
}
