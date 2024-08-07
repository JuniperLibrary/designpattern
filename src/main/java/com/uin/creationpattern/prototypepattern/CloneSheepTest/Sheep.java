package com.uin.creationpattern.prototypepattern.CloneSheepTest;

/**
 * \* Created with IntelliJ IDEA. \* @author wanglufei \* Date: 2021年08月28日 9:30 \* Description:
 * 克隆羊问题 \
 */
public class Sheep implements Cloneable {

  private String name;
  private int age;
  private String color;

  public Sheep() {

  }

  public Sheep(String name, int age, String color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "Sheep{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", color='" + color + '\'' +
        '}';
  }
}
