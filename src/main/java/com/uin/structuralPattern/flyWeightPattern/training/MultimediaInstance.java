package com.uin.structuralPattern.flyWeightPattern.training;

/**
 * 非共享具体享元类
 */
public class MultimediaInstance {

  private Multimedia flyweight;
  private String position;
  private String size;

  public MultimediaInstance(Multimedia flyweight, String position, String size) {
    this.flyweight = flyweight;
    this.position = position;
    this.size = size;
  }

  public void display() {
    flyweight.display(position, size);
  }
}
