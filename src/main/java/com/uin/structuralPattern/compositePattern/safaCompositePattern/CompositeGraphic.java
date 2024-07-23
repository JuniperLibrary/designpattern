package com.uin.structuralPattern.compositePattern.safaCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

  private List<Graphic> graphics = new ArrayList<>();

  public void add(Graphic graphic) {
    graphics.add(graphic);
  }

  public void remove(Graphic graphic) {
    graphics.remove(graphic);
  }

  public Graphic getChild(int index) {
    return graphics.get(index);
  }

  @Override
  public void draw() {
    for (Graphic graphic : graphics) {
      graphic.draw();
    }
  }
}
