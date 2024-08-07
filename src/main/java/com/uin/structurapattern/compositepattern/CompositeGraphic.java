package com.uin.structurapattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器类实现 Graphic 接口，并可以包含其他 Graphic 对象（叶子和其他容器）。
 */
public class CompositeGraphic implements Graphic {

  private List<Graphic> graphics = new ArrayList<>();

  public void add(Graphic graphic) {
    graphics.add(graphic);
  }

  public void remove(Graphic graphic) {
    graphics.remove(graphic);
  }

  @Override
  public void draw() {
    for (Graphic graphic : graphics) {
      graphic.draw();
    }
  }
}
