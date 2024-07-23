package com.uin.structuralPattern.bridgePattern;

import com.uin.structuralPattern.bridgePattern.abstractModel.Shape;
import com.uin.structuralPattern.bridgePattern.model.Circle;
import com.uin.structuralPattern.bridgePattern.model.Rectangle;

public class Main {
  public static void main(String[] args) {
    Shape circle = new Circle(5, 10, 7, new ScreenDrawingAPI());
    circle.draw();  // Output to screen
    circle.resize(1.5);
    circle.draw();  // Output to screen with resized radius

    Shape rectangle = new Rectangle(2, 3, 4, 5, new PrinterDrawingAPI());
    rectangle.draw();  // Output to printer
    rectangle.resize(2);
    rectangle.draw();  // Output to printer with resized dimensions
  }
}
