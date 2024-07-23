package com.uin.structuralPattern.adapterPattern.objectAdapter;

public class Main {

  public static void main(String[] args) {
    OldSystem oldSystem = new OldSystem();
    Target target = new ObjectAdapter(oldSystem);
    target.request();  // 输出：OldSystem specificRequest()
  }
}
