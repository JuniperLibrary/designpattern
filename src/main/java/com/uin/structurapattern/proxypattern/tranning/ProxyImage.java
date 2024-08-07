package com.uin.structurapattern.proxypattern.tranning;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 代理类，控制对 RealImage 的访问。在需要时才创建 RealImage 实例，并在后台加载原图像。
 */
public class ProxyImage implements Image {

  private final String imageUrl;
  private RealImage realImage;
  private ImageIcon icon;

  public ProxyImage(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public void displayIcon(JLabel label) {
    if (icon == null) {
      icon = new ImageIcon(getClass().getResource("/loading_icon.png")); // 加载默认图标
    }
    label.setIcon(icon);

    // 启动后台线程加载原始图片
    new Thread(() -> {
      if (realImage == null) {
        realImage = new RealImage(imageUrl);
      }
      realImage.displayIcon(label); // 显示真实图片图标
    }).start();
  }

  @Override
  public void displayImage(Component component) {
    if (realImage == null) {
      realImage = new RealImage(imageUrl);
    }
    realImage.displayImage(component);
  }
}
