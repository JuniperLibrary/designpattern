package com.uin.structurapattern.flyweightpattern.training;

public class VideoFlyweight implements Multimedia {

  private String filepath;

  public VideoFlyweight(String filepath) {
    this.filepath = filepath;
  }

  @Override
  public void display(String position, String size) {
    System.out.println("Playing video " + filepath + " at " + position + " with size " + size);
  }
}
