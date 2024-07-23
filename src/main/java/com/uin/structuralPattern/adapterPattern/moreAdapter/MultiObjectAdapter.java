package com.uin.structuralPattern.adapterPattern.moreAdapter;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MultiObjectAdapter implements Target {

  private final OldSystemA oldSystemA;

  private final OldSystemB oldSystemB;

  @Override
  public void request() {
    // 调用旧系统A的特定请求方法
    oldSystemA.specificRequestA();
    // 调用旧系统B的特定请求方法
    oldSystemB.specificRequestB();
  }
}
