package com.uin.structurapattern.decoratorpattern;

public class Client {

  public static void main(String[] args) {
    Room basicRoom = new BasicRoom();

    // 添加涂漆功能
    Room paintedRoom = new PaintedRoomDecorator(basicRoom);
    paintedRoom.decorate();

    // 添加窗帘功能
    Room curtainRoom = new CurtainRoomDecorator(basicRoom);
    curtainRoom.decorate();

    // 同时添加涂漆和窗帘功能
    Room fullyDecoratedRoom = new CurtainRoomDecorator(new PaintedRoomDecorator(basicRoom));
    fullyDecoratedRoom.decorate();
  }
}
