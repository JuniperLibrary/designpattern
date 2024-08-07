package com.uin.structurapattern.decoratorpattern;

/**
 * 装饰抽象类（Decorator）
 */
public abstract class RoomDecorator implements Room {

  protected Room decoratedRoom;

  public RoomDecorator(Room decoratedRoom) {
    this.decoratedRoom = decoratedRoom;
  }

  @Override
  public void decorate() {
    decoratedRoom.decorate();
  }
}
