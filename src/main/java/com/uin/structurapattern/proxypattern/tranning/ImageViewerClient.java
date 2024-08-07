package com.uin.structurapattern.proxypattern.tranning;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageViewerClient {

  public static void main(String[] args) {
    String imageUrl = "https://example.com/image.jpg"; // 替换为实际图片 URL

    JFrame frame = new JFrame("网络图片查看器");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setLayout(new BorderLayout());

    JLabel imageLabel = new JLabel();
    frame.add(imageLabel, BorderLayout.CENTER);

    // 创建代理对象
    Image proxyImage = new ProxyImage(imageUrl);

    // 显示缩略图标示
    proxyImage.displayIcon(imageLabel);

    // 单击图片查看原图
    imageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        proxyImage.displayImage(frame);
      }
    });

    frame.setVisible(true);
  }
}
