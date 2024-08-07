package com.uin.structurapattern.flyweightpattern.training;

public class AnimationFlyweight implements Multimedia {

  private String filepath;

  public AnimationFlyweight(String filepath) {
    this.filepath = filepath;
  }

  @Override
  public void display(String position, String size) {
    System.out.println(
        "Displaying animation " + filepath + " at " + position + " with size " + size);
  }
}
