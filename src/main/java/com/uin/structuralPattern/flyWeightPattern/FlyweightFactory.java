package com.uin.structuralPattern.flyWeightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建享元工厂
 */
public class FlyweightFactory {

  private Map<Character, Flyweight> flyweights = new HashMap<>();

  public Flyweight getFlyweight(Character key) {
    if (!flyweights.containsKey(key)) {
      flyweights.put(key, new CharacterFlyweight(key));
    }
    return flyweights.get(key);
  }
}
