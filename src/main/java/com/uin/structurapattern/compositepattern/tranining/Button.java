package com.uin.structurapattern.compositepattern.tranining;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Button implements Component {

  private String text;

  public Button(String text) {
    this.text = text;
  }

  @Override
  public void draw() {
    log.info("Button: " + text);
  }

  @Override
  public void add(Component component) {
    throw new UnsupportedOperationException("Leaf nodes do not support add operation.");
  }

  @Override
  public void remove(Component component) {
    throw new UnsupportedOperationException("Leaf nodes do not support add operation.");
  }

  @Override
  public Component getChild(int index) {
    throw new UnsupportedOperationException("Leaf nodes do not support add operation.");
  }
}
