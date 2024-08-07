package com.uin.structurapattern.proxypattern.tranning;

import java.awt.Component;
import javax.swing.JLabel;

/**
 * 定义了图片加载的标准操作。
 */
public interface Image {

  void displayIcon(JLabel label); // 显示图标

  void displayImage(Component component); // 显示原始图片
}
