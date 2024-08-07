package com.uin.structurapattern.bridgepattern;

import com.uin.structurapattern.bridgepattern.abstractmodel.Shape;
import com.uin.structurapattern.bridgepattern.model.Circle;
import com.uin.structurapattern.bridgepattern.model.Rectangle;

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
