package com.uin.structurapattern.adapterpattern.twowayadapter;


/**
 * 双向适配器，适配ClientA和ClientB接口
 */
public class TwoWayAdapter implements ClientA, ClientB {

  private ClientA clientA;

  private ClientB clientB;


  public TwoWayAdapter(ClientA clientA) {
    this.clientA = clientA;
  }

  public TwoWayAdapter(ClientB clientB) {
    this.clientB = clientB;
  }

  @Override
  public void requestA() {
    if (clientB != null) {
      clientB.requestB();
    } else {
      clientA.requestA();
    }
  }

  @Override
  public void requestB() {
    if (clientA != null) {
      clientA.requestA();
    } else {
      clientB.requestB();
    }
  }
}
