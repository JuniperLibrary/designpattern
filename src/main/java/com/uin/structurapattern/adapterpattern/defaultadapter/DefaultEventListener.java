package com.uin.structurapattern.adapterpattern.defaultadapter;

/**
 * 抽象适配器类，实现接口并提供空方法实现
 */
public abstract class DefaultEventListener implements EventListener {

  @Override
  public void onClick() {
  }

  @Override
  public void onDoubleClick() {
  }

  @Override
  public void onLongClick() {
  }
}
