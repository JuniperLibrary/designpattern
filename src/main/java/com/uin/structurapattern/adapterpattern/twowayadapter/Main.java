package com.uin.structurapattern.adapterpattern.twowayadapter;

public class Main {
  public static void main(String[] args) {
    // 使用ServiceA调用ServiceB的方法
    ClientA serviceA = new ServiceA();
    ClientB adapterAtoB = new TwoWayAdapter(serviceA);
    adapterAtoB.requestB();  // 输出：ServiceA requestA()

    // 使用ServiceB调用ServiceA的方法
    ClientB serviceB = new ServiceB();
    ClientA adapterBtoA = new TwoWayAdapter(serviceB);
    adapterBtoA.requestA();  // 输出：ServiceB requestB()
  }
}
