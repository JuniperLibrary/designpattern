package com.uin.structuralPattern.flyWeightPattern.flyWeightWithExternalStatePattern;


import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

  private final Map<String, FlyWeightExternalState> flyweights = new HashMap<>();

  public FlyWeightExternalState getFlyweight(String key) {
    if (!flyweights.containsKey(key)) {
      flyweights.put(key, new ConcreteFlyweight(key));
    }
    return flyweights.get(key);
  }
}
