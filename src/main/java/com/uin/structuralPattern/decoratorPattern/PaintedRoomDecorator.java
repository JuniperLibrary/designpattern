package com.uin.structuralPattern.decoratorPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 涂漆
 */
@Slf4j
public class PaintedRoomDecorator extends RoomDecorator {

  public PaintedRoomDecorator(Room decoratedRoom) {
    super(decoratedRoom);
  }

  @Override
  public void decorate() {
    decoratedRoom.decorate();
    log.info("Adding paint to the room");
  }
}
