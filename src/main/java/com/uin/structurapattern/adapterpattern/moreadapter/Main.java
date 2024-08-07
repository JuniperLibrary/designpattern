package com.uin.structurapattern.adapterpattern.moreadapter;

public class Main {

  public static void main(String[] args) {
    OldSystemA oldSystemA = new OldSystemA();
    OldSystemB oldSystemB = new OldSystemB();
    Target target = new MultiObjectAdapter(oldSystemA, oldSystemB);
    target.request();  // 输出：OldSystemA specificRequestA() 和 OldSystemB specificRequestB()
  }
}
