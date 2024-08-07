package com.uin.structurapattern.proxypattern.virtualpattern;

import lombok.extern.slf4j.Slf4j;

/**
 * 真实主题实现类
 */
@Slf4j
public class RealImage implements Image {

  private String fileName;

  public RealImage(String fileName) {
    this.fileName = fileName;
    loadImageFromDisk();
  }

  private void loadImageFromDisk() {
    log.info("RealImage Loading image:" + fileName);
    // 模拟从磁盘加载图片
  }

  @Override
  public void display() {
    log.info(" RealImage Displaying image:" + fileName);
  }
}
