package com.uin.structurapattern.flyweightpattern.externalstatepattern;

public class Client {

  private final FlyweightFactory factory;

  public Client(FlyweightFactory factory) {
    this.factory = factory;
  }

  public void operation(String intrinsicState, String externalState) {
    FlyWeightExternalState flyweight = factory.getFlyweight(intrinsicState);
    flyweight.operation(externalState);
  }

  public static void main(String[] args) {
    FlyweightFactory factory = new FlyweightFactory();
    Client client = new Client(factory);

    client.operation("A", "X");
    client.operation("A", "Y");
    client.operation("B", "Z");
  }
}
