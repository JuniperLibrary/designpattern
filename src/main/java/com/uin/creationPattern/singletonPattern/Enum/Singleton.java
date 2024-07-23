package com.uin.creationPattern.singletonPattern.Enum;

/**
 * 使用枚举实现单例模式
 */
public class Singleton {

  public static void main(String[] args) {
    //测试
    Singleton1 instance1 = Singleton1.INSTANCE;
    Singleton1 instance2 = Singleton1.INSTANCE;

    System.out.println(instance1 == instance2);
    System.out.println(instance1.hashCode());
    System.out.println(instance2.hashCode());

    instance1.sayOk();

    /**
     * 总结： 枚举实现单例模式优缺点
     *  (1) 这种借助JDK1.5 中添加的枚举来实现单例模式。不仅能够避免多线程同步问题，而且还能防止反序列化重新创建对象
     *  (2) 这种方式是Effective java 作者JOSh bloch提倡的方式
     */
  }
}

enum Singleton1 {
  INSTANCE;//属性

  public void sayOk() {
    System.out.println("ok");
  }
}
