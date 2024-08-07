package com.uin.structurapattern.flyweightpattern.externalstatepattern;

public class ConcreteFlyweight implements FlyWeightExternalState {

  private final String intrinsicState;

  public ConcreteFlyweight(String intrinsicState) {
    this.intrinsicState = intrinsicState;
  }

  @Override
  public void operation(String externalState) {
    System.out.println("Intrinsic State: " + intrinsicState + ", External State: " + externalState);
  }
}
