package com.uin.structuralPattern.compositePattern.transparentCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

  private List<Graphic> graphics = new ArrayList<>();

  @Override
  public void draw() {
    for (Graphic graphic : graphics) {
      graphic.draw();
    }
  }

  @Override
  public void add(Graphic graphic) {
    graphics.add(graphic);
  }

  @Override
  public void remove(Graphic graphic) {
    graphics.remove(graphic);
  }

  @Override
  public Graphic getChild(int index) {
    return graphics.get(index);
  }
}
