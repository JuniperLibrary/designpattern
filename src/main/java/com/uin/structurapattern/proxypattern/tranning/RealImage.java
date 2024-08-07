package com.uin.structurapattern.proxypattern.tranning;

import java.awt.Component;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * 实际的图片类，负责加载和显示原始图片。
 */
public class RealImage implements Image {

  private final String imageUrl;
  private ImageIcon imageIcon;
  private Image loadedImage;

  public RealImage(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  // 加载图片（模拟耗时操作）
  private void loadImage() {
    try {
      URL url = new URL(imageUrl);
      imageIcon = new ImageIcon(url);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void displayIcon(JLabel label) {
    if (imageIcon == null) {
      loadImage();
    }
    label.setIcon(imageIcon);
  }

  @Override
  public void displayImage(Component component) {
    if (loadedImage == null) {
      loadImage();
      loadedImage = this; // 将加载后的原图像保存在 loadedImage 中
    }
    JLabel label = new JLabel(imageIcon);
    JOptionPane.showMessageDialog(component, label, "原始图片", JOptionPane.PLAIN_MESSAGE);
  }
}
