package com.uin.structuralPattern.flyWeightPattern.training;

public class ImageFlyweight implements Multimedia{

  private String filepath;

  public ImageFlyweight(String filepath) {
    this.filepath = filepath;
  }

  @Override
  public void display(String position, String size) {
    System.out.println("Displaying image " + filepath + " at " + position + " with size " + size);
  }
}
