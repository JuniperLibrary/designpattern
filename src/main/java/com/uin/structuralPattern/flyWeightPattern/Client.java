package com.uin.structuralPattern.flyWeightPattern;

public class Client {

  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();

    // 获取共享的字符对象
    Flyweight a = factory.getFlyweight('A');
    Flyweight b = factory.getFlyweight('B');
    Flyweight c = factory.getFlyweight('A');

    // 使用享元对象，传递外部状态
    a.display('A', "Color: Red, Font Size: 12");
    b.display('B', "Color: Blue, Font Size: 14");
    c.display('A', "Color: Green, Font Size: 16");

    System.out.println("a and c are the same object: " + (a == c));
  }
}
