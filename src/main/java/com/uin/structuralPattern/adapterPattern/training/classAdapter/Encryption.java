package com.uin.structuralPattern.adapterPattern.training.classAdapter;

/**
 * 在类适配器模式中，我们创建一个适配器类继承自第三方加密类，并实现系统定义的加密接口。
 * <p>
 * 由于 Java 不能实现多重继承，所以我们通过实现接口来达到适配的目的。
 */
public interface Encryption {

  String encrypt(String data);
}
