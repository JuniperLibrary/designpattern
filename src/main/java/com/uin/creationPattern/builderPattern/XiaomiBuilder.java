package com.uin.creationPattern.builderPattern;

/**
 * 具体建造者
 */
public class XiaomiBuilder extends AbstractBuilder {

  public XiaomiBuilder() {
    phone = new Phone();
  }

  @Override
  AbstractBuilder custormCpu(String cpu) {
    phone.cpu = cpu;
    return this;
  }

  @Override
  AbstractBuilder custormMem(String mem) {
    phone.mem = mem;
    return this;
  }

  @Override
  AbstractBuilder custormDisk(String disk) {
    phone.disk = disk;
    return this;
  }

  @Override
  AbstractBuilder custormCam(String cam) {
    phone.cam = cam;
    return this;
  }
}
