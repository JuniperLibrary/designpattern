/**
 * 组件接口定义了图形对象的行为。
 * 它为图形组件提供了一种抽象，使得客户端可以以统一的方式处理单个图形对象和图形组件。
 */
package com.uin.structuralPattern.compositePattern.transparentCompositePattern;

/**
 * 组件接口（Component）
 */
public interface Graphic {

  /**
   * 绘制当前图形。
   * 该方法由具体的图形对象实现，以呈现自身的视觉表示。
   */
  void draw();

  /**
   * 添加一个图形对象到当前图形中。
   * 该方法用于构建图形组件的树结构，使得复杂的图形可以通过组合简单图形来构建。
   *
   * @param graphic 要添加的图形对象，它将作为当前图形的子对象。
   */
  void add(Graphic graphic);

  /**
   * 从当前图形中移除一个图形对象。
   * 该方法用于动态调整图形组件的结构，可以移除特定的子图形对象。
   *
   * @param graphic 要移除的图形对象。
   */
  void remove(Graphic graphic);

  /**
   * 获取当前图形的指定索引位置的子图形对象。
   * 该方法允许客户端访问图形组件的子对象，以进行进一步的操作或处理。
   *
   * @param index 子图形对象的索引，用于从当前图形中定位子对象。
   * @return 返回指定索引位置的子图形对象。
   */
  Graphic getChild(int index);
}

