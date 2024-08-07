package com.uin.structurapattern.flyweightpattern;

/**
 * 实现具体的享元类
 */
public class CharacterFlyweight implements Flyweight {

  private final Character character;

  public CharacterFlyweight(Character character) {
    this.character = character;
  }

  @Override
  public void display(Character character, String extrinsicState) {
    System.out.println("Character: " + this.character + ", State: " + extrinsicState);
  }
}
