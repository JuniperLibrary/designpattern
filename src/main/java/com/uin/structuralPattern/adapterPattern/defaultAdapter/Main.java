package com.uin.structuralPattern.adapterPattern.defaultAdapter;

public class Main {

  public static void main(String[] args) {
    EventListener listener = new CustomEventListener();
    listener.onClick();          // 输出：Custom onClick event.
    listener.onDoubleClick();    // 无输出
    listener.onLongClick();      // 无输出
  }
}
