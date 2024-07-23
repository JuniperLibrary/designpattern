package com.uin.structuralPattern.compositePattern.tranining;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器类实现 Component 接口，并包含子控件的列表，支持添加、删除子控件和获取子控件。
 */
public class Container implements Component {

  private List<Component> components = new ArrayList<>();

  @Override
  public void draw() {
    for (Component component : components) {
      component.draw();
    }
  }

  @Override
  public void add(Component component) {
    components.add(component);
  }

  @Override
  public void remove(Component component) {
    components.remove(component);
  }

  @Override
  public Component getChild(int index) {
    return components.get(index);
  }
}
