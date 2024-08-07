package com.uin.structurapattern.adapterpattern.objectadapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ObjectAdapter implements Target {
  // 组合
  private final OldSystem oldSystem;

  @Override
  public void request() {
    // 调用旧系统的特定请求方法
    oldSystem.specificRequest();
  }
}
