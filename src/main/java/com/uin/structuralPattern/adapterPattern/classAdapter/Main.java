package com.uin.structuralPattern.adapterPattern.classAdapter;

public class Main {

  public static void main(String[] args) {
    Target target = new ClassAdapter();
    target.request();  // 输出：OldSystem specificRequest()
  }

}
