/**
 * EventListener接口定义了对特定事件的监听操作。
 * 它提供了三种基本的事件处理方法：单击、双击和长按。
 * 该接口的实现类将负责具体处理这些事件。
 */
package com.uin.structurapattern.adapterpattern.defaultadapter;

public interface EventListener {

  /**
   * 当对象被单击时调用的方法。
   * 该方法定义了单击事件发生时的行为，具体的实现将决定如何响应单击事件。
   */
  void onClick();

  /**
   * 当对象被双击时调用的方法。
   * 该方法定义了双击事件发生时的行为，具体的实现将决定如何响应双击事件。
   */
  void onDoubleClick();

  /**
   * 当对象被长按时调用的方法。
   * 该方法定义了长按事件发生时的行为，具体的实现将决定如何响应长按事件。
   */
  void onLongClick();
}
