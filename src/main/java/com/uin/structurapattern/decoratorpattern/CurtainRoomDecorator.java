package com.uin.structurapattern.decoratorpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 加窗帘
 */
@Slf4j
public class CurtainRoomDecorator extends RoomDecorator {

  public CurtainRoomDecorator(Room decoratedRoom) {
    super(decoratedRoom);
  }

  @Override
  public void decorate() {
    decoratedRoom.decorate();
    log.info("Adding curtains to the room");
  }
}
