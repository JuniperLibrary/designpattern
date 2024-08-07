package com.uin.creationpattern.builderpattern;

/**
 * 抽象建造者
 */
public abstract class AbstractBuilder {

  Phone phone;

  abstract AbstractBuilder custormCpu(String cpu);

  abstract AbstractBuilder custormMem(String mem);

  abstract AbstractBuilder custormDisk(String disk);

  abstract AbstractBuilder custormCam(String cam);

  Phone getProduct() {
    return phone;
  }
}
