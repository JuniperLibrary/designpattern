package com.uin.structuralPattern.flyWeightPattern.training;

import java.util.ArrayList;
import java.util.List;

public class DocumentEditor {

  private MultimediaFlyweightFactory factory = new MultimediaFlyweightFactory();
  private List<MultimediaInstance> multimediaInstances = new ArrayList<>();

  public void insertMultimedia(String filetype, String filepath, String position, String size) {
    Multimedia flyweight = factory.getFlyweight(filetype, filepath);
    MultimediaInstance instance = new MultimediaInstance(flyweight, position, size);
    multimediaInstances.add(instance);
  }

  public void displayDocument() {
    for (MultimediaInstance instance : multimediaInstances) {
      instance.display();
    }
  }

  public static void main(String[] args) {
    DocumentEditor editor = new DocumentEditor();
    editor.insertMultimedia("image", "path/to/image1.jpg", "(10, 10)", "(100, 100)");
    editor.insertMultimedia("video", "path/to/video1.mp4", "(20, 20)", "(200, 200)");
    editor.insertMultimedia("image", "path/to/image1.jpg", "(30, 30)", "(150, 150)");

    editor.displayDocument();
  }
}
