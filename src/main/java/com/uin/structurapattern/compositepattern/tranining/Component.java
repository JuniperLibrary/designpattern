/**
 * 定义组件的接口，用于组合模式。
 * 组件接口定义了叶子对象和分支对象的公共行为。
 * 叶子对象和分支对象都可以被添加、移除和绘制。
 */
package com.uin.structurapattern.compositepattern.tranining;

public interface Component {

  /**
   * 绘制组件。
   * 所有实现此接口的对象（无论是叶子节点还是分支节点）都需要实现此方法，以完成自身的绘制操作。
   */
  void draw();

  /**
   * 添加一个组件。
   * 此方法使得分支对象可以添加其他组件作为其子组件，从而形成组件的树状结构。
   *
   * @param component 要添加的组件，可以是叶子节点或另一个分支节点。
   */
  void add(Component component);

  /**
   * 移除一个组件。
   * 此方法允许从当前分支对象中移除一个子组件，保持组件树的结构完整性。
   *
   * @param component 要移除的组件。
   */
  void remove(Component component);

  /**
   * 获取指定索引的子组件。
   * 此方法用于获取当前分支对象下的一个子组件，索引用于定位具体子组件。
   *
   * @param index 子组件的索引位置。
   * @return 返回位于指定索引位置的子组件。
   */
  Component getChild(int index);
}

