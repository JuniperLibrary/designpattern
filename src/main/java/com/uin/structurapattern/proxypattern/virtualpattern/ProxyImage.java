package com.uin.structurapattern.proxypattern.virtualpattern;

/**
 * 代理类
 */
public class ProxyImage implements Image {

  private RealImage realImage;
  private String filename;


  public ProxyImage(String filename) {
    this.filename = filename;
  }

  @Override
  public void display() {
    if (realImage == null) {
      realImage = new RealImage(filename);
    }
    realImage.display();
  }
}
